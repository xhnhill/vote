package com.xhn.vote.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.stereotype.Service;

@Service
public class EventSearchService {
    @Autowired
    ElasticsearchRestTemplate restTemplate;
}
