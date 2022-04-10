package com.xhn.vote.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import static org.springframework.data.elasticsearch.annotations.FieldType.Text;

@Document(indexName = "policies")
@Data
public class Policy {
    @Id
    private String policyName;
    @Field(type = Text)
    private String content;
    private String proposer;
}
