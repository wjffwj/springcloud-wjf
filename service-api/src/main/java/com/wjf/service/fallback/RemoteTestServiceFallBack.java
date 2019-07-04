package com.wjf.service.fallback;

import com.wjf.service.RemoteTestService;
import org.springframework.stereotype.Service;

/**
 * @created by 24745
 * @date 2019/7/4
 */
@Service
public class RemoteTestServiceFallBack  implements RemoteTestService {


    public String getHiFromRequest(String name) {
        return "熔断";
    }
}
