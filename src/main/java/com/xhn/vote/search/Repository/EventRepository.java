package com.xhn.vote.search.Repository;

import com.xhn.vote.entity.Event;
import com.xhn.vote.entity.MP;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface EventRepository extends ElasticsearchRepository<Event, String> {
    public List<Event> findByName(String eventName);

}
