package com.xhn.vote.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import java.util.Date;

import static org.springframework.data.elasticsearch.annotations.FieldType.Text;

@Document(indexName = "events")
@Data
public class Event {
    @Id
    private String name;
    @Field(type = Text)
    private String eventContent;
    private Date date;
}
