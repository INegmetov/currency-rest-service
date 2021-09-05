package com.example.currencyrestservice.core.service;

import com.example.currencyrestservice.core.model.GifDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;

@Service
public class GifService {

    @Autowired
    GifFeignClientService gifFeignClientService;

    public GifDto getGif(String api_key, String tag) {
        LinkedHashMap mapGif = (LinkedHashMap) gifFeignClientService.getGif(api_key, tag);
        GifDto gif = new GifDto();
        gif.setId((String) ((LinkedHashMap) mapGif.get("data")).get("id"));
        gif.setUsername((String) ((LinkedHashMap) mapGif.get("data")).get("username"));
        gif.setTitle((String) ((LinkedHashMap) mapGif.get("data")).get("title"));
        gif.setUrl((String) ((LinkedHashMap) (((LinkedHashMap) (((LinkedHashMap) mapGif.get("data")).get("images"))).get("original"))).get("url"));

        return gif;
    }
}
