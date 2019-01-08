package com.sinhen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/h")
@RestController

public class LogController {
    private static Logger logger = LoggerFactory.getLogger(LogController.class);
	@RequestMapping("/h")
	public String hello(String id){
        logger.debug("debug：....");
        logger.info("info...");
        logger.error("error...");
		return "Hello!";
	}
//	public static void main(String[] args) {
//		LoggerFactory.getLogger(LogController.class).info("hhhh");
//	}
}
