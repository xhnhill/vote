package com.xhn.vote.search.Repository;

import com.xhn.vote.entity.MP;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MPRepository extends ElasticsearchRepository<MP, String> {
    Page<MP> findByName(String name, Pageable pageable);
    Page<MP> findByPosition(String name, Pageable pageable);

}
