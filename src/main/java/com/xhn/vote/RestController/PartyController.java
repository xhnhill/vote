package com.xhn.vote.RestController;

import com.xhn.vote.entity.Party;
import com.xhn.vote.service.PartySearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PartyController {
    @Autowired
    PartySearchService partySearchService;
    @GetMapping("/party")
    @ResponseBody
    public List<Party> getAllParty(){
        return partySearchService.findAllParty(10);
    }
    @GetMapping("/party/findByname")
    @ResponseBody
    public List<Party> getPartyByName(@RequestParam(name = "partyName") String name){
        return partySearchService.findByName(name);
    }
}
