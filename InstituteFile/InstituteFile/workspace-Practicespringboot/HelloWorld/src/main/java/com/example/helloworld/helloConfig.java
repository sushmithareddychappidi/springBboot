package com.example.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloConfig {
@RequestMapping("/hello")
public String hello()
{
	return "Hello world!!!!!!!!!!!!!!!";
}
}
