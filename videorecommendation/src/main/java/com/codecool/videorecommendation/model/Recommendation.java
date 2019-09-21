package com.codecool.videorecommendation.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Recommendation {

    @GeneratedValue
    @Id
    private Integer id;

    @Min(1)
    @Max(5)
    private Integer rating;

    private String comment;

    @NotNull
    private Integer videoId;

    public Recommendation(Integer rating, String comment, Integer videoId){
        this.rating = rating;
        this.comment = comment;
        this.videoId = videoId;
    }
}
