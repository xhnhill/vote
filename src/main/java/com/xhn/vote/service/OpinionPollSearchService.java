package com.xhn.vote.service;

import com.xhn.vote.entity.Event;
import com.xhn.vote.entity.opinionPoll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.mapping.IndexCoordinates;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import static org.elasticsearch.index.query.QueryBuilders.rangeQuery;

@Service
public class OpinionPollSearchService {
    @Autowired
    ElasticsearchRestTemplate restTemplate;

    public List<opinionPoll> findByYear(int year){
        NativeSearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withQuery(rangeQuery("date")
                        .gt(LocalDate.of(year,1,1).toString()))
                .build();
        SearchHits<opinionPoll> eventSearchHits = restTemplate.search(searchQuery,opinionPoll.class, IndexCoordinates.of("opinionpoll"));
        return eventSearchHits.getSearchHits().stream().map(x->x.getContent()).collect(Collectors.toList());
    }
}
