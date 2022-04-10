package com.xhn.vote.RestController;

import com.xhn.vote.entity.MP;
import com.xhn.vote.service.MPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class MPController {
    @Autowired
    MPService mpService;
    @GetMapping("/MP/findByName")
    @ResponseBody
    public List<MP> getMP(@RequestParam String name){

        return mpService.findMPByName(name);
    }
    @GetMapping("/MP/findByPosition")
    @ResponseBody
    public List<MP> getMPByPostion(@RequestParam(name = "position") String position){

        return mpService.findMPByPosition(position);
    }
}
