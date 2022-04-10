package com.xhn.vote.RestController;

import com.xhn.vote.entity.Party;
import com.xhn.vote.entity.opinionPoll;
import com.xhn.vote.service.OpinionPollSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OpinionPollController {
    @Autowired
    OpinionPollSearchService opinionPollSearchService;
    @GetMapping("/opinionPoll")
    @ResponseBody
    public List<opinionPoll> getAllParty(@RequestParam() int year){
        return opinionPollSearchService.findByYear(year);
    }
}
