package com.codecool.videoservice;

import com.codecool.videoservice.model.Video;
import com.codecool.videoservice.repository.VideoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DataInitializer implements CommandLineRunner {


    private final VideoRepository videos;

    public DataInitializer(VideoRepository videos) {
        this.videos = videos;
    }

    @Override
    public void run(String... args) throws Exception {
        log.debug("Generate sample data");
        videos.save(new Video("Mothers vs Daughters: Is Marriage Necessary?", "https://www.youtube.com/watch?v=RB1ttLswqOw"));
        videos.save(new Video("Ivy League vs Community College: Which Education Is Better?", "https://www.youtube.com/watch?v=EMpaw46kr2w"));
        videos.save(new Video("Instagram vs Runway Models: Can Anyone Be a Model?", "https://www.youtube.com/watch?v=6OKDa9h4lDo"));
        videos.save(new Video("Millionaires vs Minimum Wage: Did You Earn Your Money?", "https://www.youtube.com/watch?v=7jQ53OrHQ_k"));
    }
}
