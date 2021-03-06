package com.example.currencyrestservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableFeignClients
@PropertySource("classpath:currency.properties")
public class CurrencyRestServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurrencyRestServiceApplication.class, args);
    }

}
