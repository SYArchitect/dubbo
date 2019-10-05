package com.hfz.dubbo.dubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hfz.dubbo.dubboapi.entity.People;
import com.hfz.dubbo.dubboapi.service.PeopleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HFZ
 */

@RestController
public class PeopleController {
    @Reference
    private PeopleService peopleService;

    @GetMapping("people/{name}")
    public People getPeople(@PathVariable("name") String name) {
        People people = new People();
        people.setName(name);
        return peopleService.getPeople(people);
    }
}
