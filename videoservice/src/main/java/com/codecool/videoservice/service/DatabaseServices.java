package com.codecool.videoservice.service;


import com.codecool.videoservice.model.Recommendation;
import com.codecool.videoservice.model.Video;
import com.codecool.videoservice.repository.VideoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DatabaseServices {

    @Autowired
    VideoRepository videoRepository;

    @Autowired
    RecommendationServiceCaller caller;


    public List<Video> getAllVideos() {
        return videoRepository.findAll();
    }

    public List<Recommendation> getRecommendationsForVideo(Integer id) {
        return caller.getRecommendationsForVideo(id);
    }

    public Video getVideoById(Integer id) {
        return videoRepository.getById(id);
    }
}
