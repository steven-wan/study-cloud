package org.stevenwan.payment.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.stevenwan.payment.api.DemoServiceApi;

/**
 * @author: steven-wan
 * @times: 2022-04-28
 * @desc:
 **/
@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @DubboReference
    private DemoServiceApi demoServiceApi;

    @RequestMapping(value = "/echo/{str}", method = RequestMethod.GET)
    public String echo(@PathVariable String str) {
        return restTemplate.getForObject("http://payment-privoder/config/echo/" + str, String.class);
    }

    @GetMapping(value = "comeOn")
    public String comeOn(@RequestParam String str) {
        return demoServiceApi.sayHello(str);
    }
}