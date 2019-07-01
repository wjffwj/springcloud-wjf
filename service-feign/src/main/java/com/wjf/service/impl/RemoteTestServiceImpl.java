package com.wjf.service.impl;

import com.wjf.service.RemoteTestService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @created by 24745
 * @date 2019/6/29
 */
@RestController

public class RemoteTestServiceImpl implements RemoteTestService {

    @Override
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String getHiFromRequest(String name) {
        return "test ok";
    }
}
