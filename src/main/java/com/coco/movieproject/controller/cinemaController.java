package com.coco.movieproject.controller;

import com.coco.movieproject.entity.Cinema;
import com.coco.movieproject.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cinemaController {
    @Autowired
    private CinemaService cinemasService;
    @RequestMapping("/ww/{wid}")
    public Cinema selectW(@PathVariable String wid) {
        return cinemasService.getById(wid);
    }

}
