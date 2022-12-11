package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee {

	@RequestMapping("/")
	   public String hello() {
	        return "Hello rollig out";
	    }

@RequestMapping("/roll")
public String welcome() {
  return "Welcome to rollout and rollback strategy";
}
}
