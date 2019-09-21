package com.codecool.videorecommendation.service;

import com.codecool.videorecommendation.model.Recommendation;
import com.codecool.videorecommendation.repository.RecommendationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class RecommendationService {

    @Autowired
    RecommendationRepository repository;

    public List<Recommendation> retrieveAllByVideo(Integer videoId) {
        return repository.getRecommendationsByVideoId(videoId);
    }


}
