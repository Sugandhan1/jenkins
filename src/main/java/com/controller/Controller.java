package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/jenkins")
public class Controller 
{
	@GetMapping (value = "/helloworld")
	public String toPrintHelloWorld()
	{
		return "Hello World";
	}
	
	@GetMapping (value = "/getname/{name}")
	public String getName(@PathVariable String name)
	{
		return name;
	}
}
