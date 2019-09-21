package com.codecool.videoservice.repository;

import com.codecool.videoservice.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Integer> {

    Video getById(Integer id);

    Video findDistinctByIdLike(Integer id);
}
