package com.codecool.videoservice.service;

import com.codecool.videoservice.model.Recommendation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;


import java.util.List;

@Service
@Slf4j
public class RecommendationServiceCaller {

    @Autowired
    RestTemplate restTemplate;

    @Value("${videorecommendation.url}")
    private String baseUrl;

    public List<Recommendation> getRecommendationsForVideo(Integer videoId) {
        String id = Integer.toString(videoId);
        ResponseEntity<List<Recommendation>> response = restTemplate.exchange(
                baseUrl + "/" + id,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Recommendation>>() {
                });
        return response.getBody();
    }

}
