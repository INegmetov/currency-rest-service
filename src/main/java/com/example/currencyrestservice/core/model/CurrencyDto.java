package com.example.currencyrestservice.core.model;

import lombok.Data;

import java.util.Map;

@Data
public class CurrencyDto {

        String base;
        Map<String,Double> rates;
        String date;

}
