package com.codecool.videorecommendation.service;

import com.codecool.videorecommendation.model.Recommendation;
import com.codecool.videorecommendation.repository.RecommendationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class RecommendationService {

    @Autowired
    RecommendationRepository repository;

    public List<Recommendation> retrieveAllByVideo(Integer videoId) {
        return repository.getRecommendationsByVideoId(videoId);
    }


    public void saveRecommendation(Integer videoId, Map<String, String> data) {
        Integer rate = Integer.parseInt(data.get("rating"));
        Recommendation build = Recommendation.builder()
                .videoId(videoId)
                .rating(rate)
                .comment(data.get("comment"))
                .build();
        repository.save(build);
    }
}
