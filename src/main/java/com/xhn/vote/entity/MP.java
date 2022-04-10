package com.xhn.vote.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import static org.springframework.data.elasticsearch.annotations.FieldType.Text;

@Document(indexName = "mppool",createIndex = true)
@Data
public class MP {

    @Id
    private String name;
    @Field(type = Text)
    private String Position;
    private String email;

    public MP(String name) {
        this.name = name;

    }

    public MP() {
    }


    public MP(String name, String position) {
        this.name = name;
        Position = position;
    }
}
