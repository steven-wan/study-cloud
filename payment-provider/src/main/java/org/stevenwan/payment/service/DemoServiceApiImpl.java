package org.stevenwan.payment.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.stevenwan.payment.api.DemoServiceApi;

/**
 * @author: steven-wan
 * @times: 2022-04-28
 * @desc:
 **/
@DubboService
public class DemoServiceApiImpl implements DemoServiceApi {
    @Override
    public String sayHello(String world) {
        return "加油哦，小万" + world;
    }
}
