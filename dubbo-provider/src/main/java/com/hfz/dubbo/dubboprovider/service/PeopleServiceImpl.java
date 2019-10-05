package com.hfz.dubbo.dubboprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.hfz.dubbo.dubboapi.entity.People;
import com.hfz.dubbo.dubboapi.service.PeopleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

/**
 * @author HFZ
 */

@Service
public class PeopleServiceImpl implements PeopleService {

    private static final Logger logger = LoggerFactory.getLogger(PeopleServiceImpl.class);

    @Override
    public People getPeople(People people) {
        people.setId(new Random().nextInt(10000));
        logger.debug("People:{},ID:{}",people.getName(),people.getId());
        return people;
    }
}
