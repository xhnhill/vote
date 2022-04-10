package com.xhn.vote.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import java.util.List;

import static org.springframework.data.elasticsearch.annotations.FieldType.Text;

@Document(indexName = "policies")
@Data
public class Policy {
    @Id
    private String policyName;
    @Field(type = Text)
    private String content;
    private String proposer;
    private List<String> feedbacks;
    //From 1-100
    private int progress;

}
