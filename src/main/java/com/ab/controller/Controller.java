package com.ab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ab.runner.ActionRestConsumer;

@RestController
@RequestMapping("/show")
public class Controller {
	
	@Autowired
	ActionRestConsumer consumer;
	
	@GetMapping("/details")
	public String msg() {
		return  consumer.getWishMessage().getBody();
	}
}
