package com.qwerty.demo.config;

import com.qwerty.demo.Service.GPayService;
import com.qwerty.demo.Service.PaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentConfig {
    @Bean
    PaymentService GPayService(){
        return new GPayService();
    }

}
