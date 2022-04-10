package com.xhn.vote.service;

import com.xhn.vote.entity.MP;
import com.xhn.vote.search.Repository.MPRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.mapping.IndexCoordinates;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static org.elasticsearch.index.query.QueryBuilders.matchQuery;

@Service
public class MPService {
    @Autowired
    MPRepository mpRepository;
    @Autowired
    ElasticsearchRestTemplate restTemplate;
    public void saveMP(MP mp){
        mpRepository.save(mp);
    }
    public List<MP> findMPByName(String name){
        Page<MP> page = mpRepository.findByName(name, Pageable.ofSize(1));
        return page.getContent();
    }
    public List<MP> findMPByPosition(String position){
        NativeSearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withQuery(matchQuery("Position",position))
                .build();
        SearchHits<MP> searchHits = restTemplate.search(searchQuery,MP.class, IndexCoordinates.of("mppool"));
        return searchHits.getSearchHits().stream().map(x->x.getContent()).collect(Collectors.toList());

    }
}
