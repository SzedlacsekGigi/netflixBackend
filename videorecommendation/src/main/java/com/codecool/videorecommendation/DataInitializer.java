package com.codecool.videorecommendation;

import com.codecool.videorecommendation.model.Recommendation;
import com.codecool.videorecommendation.repository.RecommendationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DataInitializer implements CommandLineRunner {

    private final RecommendationRepository repository;

    public DataInitializer(RecommendationRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        log.debug("Initialize recommendations");
        repository.save(new Recommendation(5, "Super", 1));
        repository.save(new Recommendation(2, "Hated it", 1));
        repository.save(new Recommendation(3, "Mediocre", 1));
        repository.save(new Recommendation(4, "It was good", 2));
        repository.save(new Recommendation(4, "Would recommend", 2));
        repository.save(new Recommendation(3, "It was okay", 3));
        repository.save(new Recommendation(1, "Didn't like it", 3));
        repository.save(new Recommendation(5, "Awesome", 4));

    }
}
