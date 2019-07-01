package com.wjf.service.impl;

import com.wjf.service.RemoteTest1Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @created by 24745
 * @date 2019/6/29
 */
@RestController
public class RemoteTest1ServiceImpl implements RemoteTest1Service {

    @Override
    @RequestMapping(value = "/ok", method = RequestMethod.GET)
    public String getHiFromRequest(String name) {
        return "okok";
    }
}
