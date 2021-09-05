package com.example.currencyrestservice.service;

import com.example.currencyrestservice.core.model.CurrencyDto;
import com.example.currencyrestservice.core.service.CurrencyFeignClientService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CurrencyServiceTest {

    @MockBean
    CurrencyFeignClientService currencyFeignClientService;


    @Test
    void getCurrentDay() {
        CurrencyDto currencyDto = currencyFeignClientService.getCurrentDay("","");
        Mockito.verify(currencyFeignClientService,Mockito.times(1)).getCurrentDay("","");
    }

    @Test
    void getOtherDay() {
        CurrencyDto currencyDto = currencyFeignClientService.getOtherDay("","","");
        Mockito.verify(currencyFeignClientService,Mockito.times(1)).getOtherDay("","","");
    }
}
