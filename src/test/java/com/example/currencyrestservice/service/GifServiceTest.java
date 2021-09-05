package com.example.currencyrestservice.service;

import com.example.currencyrestservice.core.service.GifFeignClientService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GifServiceTest {

    @MockBean
    GifFeignClientService gifFeignClientService;

    @Test
    void getGif() {
        Map<String,Object> map = gifFeignClientService.getGif("","");
        Mockito.verify(gifFeignClientService,Mockito.times(1)).getGif("","");

    }
}
