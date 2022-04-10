package com.xhn.vote.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import java.time.LocalDate;


@Document(indexName = "opinionpoll")
@Data
public class opinionPoll {
    @Id
    private String id;
    private LocalDate date;
    private String brand;
    @Field(analyzer = "/")
    private String interviewMode;
    private int sampleSize;
    private float LNPPercent;
    private float ALPPercent;
    private float GRNPercent;
    private float ONPPercent;
    private float UAPPercent;
    private float OTHPercent;
    private float UNDPercent;

}
