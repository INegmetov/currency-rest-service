package com.example.currencyrestservice.core.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(name = "giphy-api", url = "${giphy-api.ribbon.listOfServers}")
public interface GifFeignClientService {
    @GetMapping("/random")
    Map<String, Object> getGif(@RequestParam("api_key") String api_key, @RequestParam("tag") String tag);
}
