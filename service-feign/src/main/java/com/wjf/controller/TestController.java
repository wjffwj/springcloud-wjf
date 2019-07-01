package com.wjf.controller;

//import com.wjf.service.RemoteTest1Service;
import com.wjf.service.RemoteTest1Service;
import com.wjf.service.RemoteTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @created by 24745
 * @date 2019/6/29
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {
    @Autowired
    private RemoteTestService remoteTestService;

    @Autowired
    private RemoteTest1Service remoteTest1Service;

    @GetMapping(value = "/test")
    public String ok() {
        String ok = remoteTestService.getHiFromRequest("ok");
        return ok;
    }

    @GetMapping("/ok")
    public String ok1() {
        String hiFromRequest = remoteTest1Service.getHiFromRequest("111");
        return hiFromRequest;
    }

}
