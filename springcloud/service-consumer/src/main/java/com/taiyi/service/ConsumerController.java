package com.taiyi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Author:hyson
 * Date:2018-06-12 23:29
 **/
@RestController
public class ConsumerController{

    @Autowired Servers server;

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public String query() {
        return server.query();
    }
}
