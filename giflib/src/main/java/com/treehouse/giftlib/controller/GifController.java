package com.treehouse.giftlib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.treehouse.giftlib.model.Gif;
import org.springframework.web.method.annotation.ModelMethodProcessor;

import java.time.LocalDate;

@Controller
public class GifController {
    @RequestMapping("/")
    public String listGifs(){
        return "home";
    }

    @RequestMapping("/gif")
    public String gifDetails(ModelMap modelMap){
        Gif gif = new Gif("compiler-bot", LocalDate.of(2016,11,17), "Troy Bell", true);
        modelMap.put("gif",gif);
        return "gif-details";
    }
}
