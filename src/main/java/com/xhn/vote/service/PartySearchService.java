package com.xhn.vote.service;

import com.xhn.vote.entity.Party;
import com.xhn.vote.search.Repository.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@Service
public class PartySearchService {
    @Autowired
    ElasticsearchRestTemplate restTemplate;
    @Autowired
    PartyRepository partyRepository;
    public List<Party> findAllParty(int limit){
        int count = limit;
        Iterator<Party> parties = partyRepository.findAll().iterator();
        LinkedList<Party> results = new LinkedList<>();
        while(parties.hasNext() && count>0){
            results.add(parties.next());
            count--;
        }
        return results;


    }
    public List<Party> findByName(String name){
        return partyRepository.findByPartyName(name, Pageable.ofSize(1)).getContent();
    }
}
