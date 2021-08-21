package com.alex.fallback;


import com.alex.client.ProductClient;
import com.alex.vo.ProductVO;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author wsh
 * @date 2021-08-21
 *
 * OpenFeign的容错工厂类
 */
@Component
@Slf4j
public class ProductServiceFallbackFactory implements FallbackFactory<ProductClient> {

    @Override
    public ProductClient create(Throwable throwable) {
        return new ProductClient() {
            @Override
            public ProductVO product(Long productId) {
                log.error("{}", throwable);
                return null;
            }
        };
    }
}
