package com.example.currencyrestservice.api.controller;


import com.example.currencyrestservice.core.model.CurrencyDto;
import com.example.currencyrestservice.core.model.GifDto;
import com.example.currencyrestservice.core.service.CurrencyService;
import com.example.currencyrestservice.core.service.GifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CurrencyController {
    @Autowired
    CurrencyService currencyService;

    @Autowired
    GifService gifService;

    @Value("${symbols}")
    String symbol;

    @Value("${date}")
    String date;

    @Value("${app_id}")
    String app_id;

    @Value("${api_key}")
    String api_key;

    @Value("${tag_rich}")
    String tag_rich;

    @Value("${tag_broke}")
    String tag_broke;

    @GetMapping("/")
    public GifDto getResponseAtGif(CurrencyDto currencyToday, CurrencyDto currencyAnyDay) {

        if (currencyAnyDay.getRates() == null && currencyToday.getRates() == null) {
            currencyToday = currencyService.getCurrentDay(app_id, symbol);
            currencyAnyDay = currencyService.getOtherDay(date, app_id, symbol);
        }
        Map<String, Double> mapAnyDay = currencyAnyDay.getRates();
        Map<String, Double> mapToday = currencyToday.getRates();

        GifDto gifDto;
        if (mapToday.get(symbol) > mapAnyDay.get(symbol)) {
            gifDto = gifService.getGif(api_key, tag_rich);
            gifDto.setTag(tag_rich);
        } else {
            gifDto = gifService.getGif(api_key, tag_broke);
            gifDto.setTag(tag_broke);

        }
        return gifDto;
    }
}
