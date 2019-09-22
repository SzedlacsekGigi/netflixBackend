package com.codecool.videorecommendation.controller;

import com.codecool.videorecommendation.model.Recommendation;
import com.codecool.videorecommendation.service.RecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/recommendation")
@CrossOrigin
public class RecommendationController {

    @Autowired
    RecommendationService service;

    @GetMapping("/{videoId}")
    public List<Recommendation> getRecommendationsByVideo(@PathVariable("videoId") Integer videoId){
        return service.retrieveAllByVideo(videoId);
    }

    @RequestMapping(
            value = "/video/{videoId}",
            produces = "application/json",
            method = {RequestMethod.POST})
    public void saveNewRecommendation(@PathVariable("videoId") Integer videoId, @RequestBody Map<String, String> data){
        service.saveRecommendation(videoId, data);
    }



}
