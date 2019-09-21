package com.codecool.videorecommendation.controller;

import com.codecool.videorecommendation.model.Recommendation;
import com.codecool.videorecommendation.service.RecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/recommendation")
public class RecommendationController {

    @Autowired
    RecommendationService service;

    @GetMapping("/{videoId}")
    public List<Recommendation> getRecommendationsByVideo(@PathVariable("videoId") Integer videoId){
        return service.retrieveAllByVideo(videoId);
    }



}
