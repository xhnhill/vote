package com.xhn.vote.search.Repository;

import com.xhn.vote.entity.MP;
import com.xhn.vote.entity.Party;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartyRepository extends ElasticsearchRepository<Party, String> {
    Page<Party> findByPartyName(String partyName, Pageable pageable);
}
