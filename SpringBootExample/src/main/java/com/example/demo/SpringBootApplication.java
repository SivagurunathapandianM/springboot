package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication extends SpringBootServletInitializer implements ApplicationRunner {
	
	/**
	   * The entry point of application.
	   *
	   * @param args the input arguments
	   * ---------------------------------------------------------------
	   * when application want to deploy in Servlet Container: Tomcat.jetty etc
	   * extends SpringBootServletInitializer -> extending the main class will helps
	   */
	private static final Logger log = LoggerFactory.getLogger(SpringBootApplication.class);
	   
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	      return application.sources(SpringBootApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplication.class, args);
	}

	public void run(ApplicationArguments arg0) throws Exception {
		log.info("Hello World from Application Runner");
		
		/*CommandLineRunner and ApplicationRunner serve the same purpose.
		The difference between CommandLineRunner and ApplicationRunner is that the run()
		method of CommandLineRunner accepts array of String as an argument and run() method
		of ApplicationRunner accepts spring ApplicationArguments as an argument.*/
		/*
		 * Examples for Apllication and command line runner:
		https://www.concretepage.com/spring-boot/spring-boot-commandlinerunner-and-applicationrunner-example#:~:text=CommandLineRunner%20and%20ApplicationRunner%20serve%20the,spring%20ApplicationArguments%20as%20an%20argument.
		*/	
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
