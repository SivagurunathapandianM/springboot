package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Tomcatcontroller {

	/*@GetMapping("/hello")
    public Collection<String> sayHello() {
        return IntStream.range(0, 10)
          .mapToObj(i -> "Hello number " + i)
          .collect(Collectors.toList());
    }*/
	
	@RequestMapping(value = "/SpringbootExample1")
	public String hello(){
		return "Hello, Springboot world";
	}
	
	@RequestMapping(value = "/")
    public String helloTomcat() {
      return "Hello World from Tomcat";
    }
}
