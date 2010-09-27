package com.arun.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@Autowired
	public TestController() {
		System.out.println("TestController Constructor");
	}

	@ResponseBody
	@RequestMapping("/test.htm")
	public String test(HttpServletRequest request) {
		return "Hallo word";
	}
}
