package com.netmatrix.workflow.engine.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    private final static Logger logger =  LogManager.getLogger();

    @RequestMapping("/test")
    public String test(@RequestParam("value") String value) {
        logger.info("TestController#test, value={}", value);
        return value.toUpperCase();
    }
}
