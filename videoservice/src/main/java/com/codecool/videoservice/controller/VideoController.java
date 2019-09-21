package com.codecool.videoservice.controller;

import com.codecool.videoservice.model.Video;
import com.codecool.videoservice.service.DatabaseServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@Slf4j
public class VideoController {

    @Autowired
    DatabaseServices databaseServices;

    @GetMapping("/main")
    public List<Video> listAllVideos() {
        return databaseServices.getAllVideos();
    }

    @GetMapping("/video/{id}")
    public HashMap<String, Object> showDetailPage(@PathVariable("id") Integer id) {
        HashMap<String, Object> detailedData = new HashMap<>();
        detailedData.put("video", databaseServices.getVideoById(id));
        detailedData.put("recommendations", databaseServices.getRecommendationsForVideo(id));
        return detailedData;
    }
}
