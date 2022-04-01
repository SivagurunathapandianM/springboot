package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Tomcatcontroller {

	@Autowired
	RestTemplate restTemplate;
	/*@GetMapping("/hello")
    public Collection<String> sayHello(){
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
	
	@Bean
    public RestTemplate getRestTemplate() {
      return new RestTemplate();   
    }
}
