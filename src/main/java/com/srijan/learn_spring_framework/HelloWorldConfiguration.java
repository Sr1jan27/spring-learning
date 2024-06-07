package com.srijan.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// Released with Java JDK 16. 
record Person (String name, int age, Address address) {};

// Address - firstline and city

record Address (String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Srijan";
	}
	
	@Bean
	public int age() {
		return 22;
	}
	
	@Bean
	public Person person() {
		var person = new Person("Dhruv", 22, new Address("Main Street", "London"));
		return person;
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}
	
	@Bean( name ="address2")
	public Address address() {
		var address = new Address("R cube Properties", "Hyderabad");
		return address;
	}

}
