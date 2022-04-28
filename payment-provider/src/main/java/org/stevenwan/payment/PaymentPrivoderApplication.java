package org.stevenwan.payment;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: steven-wan
 * @times: 2022-03-14
 * @desc:
 **/
@SpringBootApplication
@EnableDubbo
public class PaymentPrivoderApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaymentPrivoderApplication.class, args);
    }
}
