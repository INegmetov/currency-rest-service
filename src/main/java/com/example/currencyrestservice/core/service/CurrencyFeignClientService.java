package com.example.currencyrestservice.core.service;

import com.example.currencyrestservice.core.model.CurrencyDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(name = "currency-api",url = "${currency-api.ribbon.listOfServers}")
public interface CurrencyFeignClientService {

    @GetMapping("/historical/{date}.json")
    CurrencyDto getOtherDay(@PathVariable("date") String date, @RequestParam("app_id")String app_id, @RequestParam("symbols")String symbols);

    @GetMapping("/latest.json")
    CurrencyDto getCurrentDay( @RequestParam("app_id")String app_id,@RequestParam("symbols")String symbols);
}
