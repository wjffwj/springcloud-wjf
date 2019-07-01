package com.wjf.controller;

import com.netflix.discovery.converters.Auto;
import com.wjf.service.RemoteTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @created by 24745
 * @date 2019/7/1
 */
@RestController
public class TestController {
    @Autowired
    public RemoteTestService remoteTestService;

    @RequestMapping(value = "/ojbk")
    public String ok() {
        return remoteTestService.getHiFromRequest("1");
    }
}
