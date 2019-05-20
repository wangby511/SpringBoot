package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class Hello {
	@RequestMapping("/main")

	public String hello(){
		return "hello for mac wangboyuan!";
	}
}

