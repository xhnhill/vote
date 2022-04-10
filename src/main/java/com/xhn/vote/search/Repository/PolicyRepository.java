package com.xhn.vote.search.Repository;

import com.xhn.vote.entity.MP;
import com.xhn.vote.entity.Policy;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface PolicyRepository extends ElasticsearchRepository<Policy, String> {
    public List<Policy> findByProposer(String name);
    public List<Policy> findByPolicyName(String policyName);
}
