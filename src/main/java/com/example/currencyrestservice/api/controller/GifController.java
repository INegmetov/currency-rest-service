package com.example.currencyrestservice.api.controller;

import com.example.currencyrestservice.core.model.CurrencyDto;
import com.example.currencyrestservice.core.model.GifDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GifController {
    @Autowired
    CurrencyController currencyController;

    @GetMapping("/gif")
    public String getGif(Model model){
        GifDto gif = currencyController.getResponseAtGif(new CurrencyDto(),new CurrencyDto());
        model.addAttribute("gif",gif);
        return "gif";
    }
}
