package com.lara.app1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App1Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(App1Application.class, args);
		System.out.println("app started.....");
		int a = 10;
		int b = 20;
	}
	
	@Override
	public void run(String... args) throws Exception {
	 System.out.println("I am from run");
	 for(String arg : args) {
		 System.out.println(arg);
	 }
	}
	
	
	@RequestMapping(path = "/hello")
	public String sayHello() {
		System.out.println("I am from sayHello");
		return "Hello From Spring Boot";
	}

}

//http://localhost:8081/hello
