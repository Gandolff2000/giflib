package com.treehouse.giftlib.controller;

import com.treehouse.giftlib.data.GifReposistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.treehouse.giftlib.model.Gif;
import org.springframework.web.method.annotation.ModelMethodProcessor;

import java.util.List;
import java.time.LocalDate;

@Controller
public class GifController {

    @Autowired
    private GifReposistory gifReposistory;

    @RequestMapping("/")
    public String listGifs(ModelMap modelMap){
        List<Gif> allGifs = gifReposistory.getAllGifs();
        modelMap.put("gifs",allGifs);
        return "home";
    }

    @RequestMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name, ModelMap modelMap){
        Gif gif = gifReposistory.findByName(name);
        modelMap.put("gif",gif);
        return "gif-details";
    }
}
