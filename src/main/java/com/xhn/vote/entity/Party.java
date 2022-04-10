package com.xhn.vote.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import static org.springframework.data.elasticsearch.annotations.FieldType.Text;

@Document(indexName = "parties")
@Data
public class Party {
    @Id
    private String partyName;
    @Field(type = Text)
    private String description;
    private String leader;
}
