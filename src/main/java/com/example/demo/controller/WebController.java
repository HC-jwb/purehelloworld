package com.example.demo.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WebController {
	
	@RequestMapping("hello")
	public String test() {
		System.out.println("hhelo");
		System.out.println("hello world");
		return "hello.html";
	}
	
	
	
}
