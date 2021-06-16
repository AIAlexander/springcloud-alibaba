package com.alex.client;

import com.alex.api.ProductApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author wsh
 * @date 2021-06-13
 */
@FeignClient(value = "service-product")
public interface ProductClient extends ProductApi {

}
