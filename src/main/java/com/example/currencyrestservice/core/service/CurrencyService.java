package com.example.currencyrestservice.core.service;

import com.example.currencyrestservice.core.model.CurrencyDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyService {

    @Autowired
    CurrencyFeignClientService currencyFeignClientService;

    public CurrencyDto getCurrentDay(String app_id, String symbols) {
        return currencyFeignClientService.getCurrentDay( app_id, symbols);
    }

    public CurrencyDto getOtherDay(String date, String app_id, String symbols) {
        return currencyFeignClientService.getOtherDay(date, app_id, symbols);
    }

}
