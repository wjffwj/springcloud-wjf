package com.wjf.service;

import com.wjf.service.fallback.RemoteTestServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-feign",fallback = RemoteTestServiceFallBack.class)
public interface RemoteTestService {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String getHiFromRequest(@RequestParam(value = "name") String name);

}
