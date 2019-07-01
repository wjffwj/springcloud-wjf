package com.wjf.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-feign")
public interface RemoteTest1Service {

    @RequestMapping(value = "/ok", method = RequestMethod.GET)
    String getHiFromRequest(@RequestParam(value = "name") String name);
}
