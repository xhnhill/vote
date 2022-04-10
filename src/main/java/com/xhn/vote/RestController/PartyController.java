package com.xhn.vote.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PartyController {
    @GetMapping("/party")
    public String getParty(){
        return "hello, which Mp do you want?";
    }
}
