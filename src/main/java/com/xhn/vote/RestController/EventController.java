package com.xhn.vote.RestController;

import com.xhn.vote.entity.Event;
import com.xhn.vote.service.EventSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventController {
    @Autowired
    EventSearchService eventSearchService;
    @GetMapping("/commingEvents")
    @ResponseBody
    public List<Event> getCommingEvents(){
        return eventSearchService.findCommingEvent();
    }
    @GetMapping("/findEventByName")
    @ResponseBody
    public List<Event> getEventByName(@RequestParam(name = "eventName") String name){
        return eventSearchService.findEventByName(name);
    }
}
