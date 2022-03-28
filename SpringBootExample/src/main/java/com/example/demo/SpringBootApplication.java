package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication extends SpringBootServletInitializer{
	
	/**
	   * The entry point of application.
	   *
	   * @param args the input arguments
	   * ---------------------------------------------------------------
	   * when application want to deploy in Servlet Container: Tomcat.jetty etc
	   * extends SpringBootServletInitializer -> extending the main class will helps
	   */
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	      return application.sources(SpringBootApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplication.class, args);
	}
	
	/*
	 * -------------------------------------------------------------------------------------
	 * SpringBoot Main Website:
	 * https://spring.io/projects/spring-boot
	 * -------------------------------------------------------------------------------------
	 * Maven Resource Plugin Issue:
	 * https://stackoverflow.com/questions/65910112/maven-clean-install-failed-to-execute-goal-org-apache-maven-pluginsmaven-resou
	 * -------------------------------------------------------------------------------------
	 * 
	 * Springboot War deployment to tomcat server:
	 * https://www.baeldung.com/spring-boot-war-tomcat-deploy
	 * -------------------------------------------------------------------------------------
	 * 
	 * 
    */	
	
}
