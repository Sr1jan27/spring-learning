package com.srijan.learn_spring_framework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


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
	
	@Bean
	public Person person3Parameters(String name, int age, Address address2) {
		return new Person(name, age, address2);
	}
	
	@Bean
	@Primary
	public Person person4Parameters(String name, int age, Address address) {
		return new Person(name, age, address);
	}
	
	@Bean
	public Person person5Qualifier(String name, int age, @Qualifier("address3qulifier")Address address) {
		return new Person(name, age, address);
	}
	
	@Bean( name ="address2")
	@Primary
	public Address address() {
		var address = new Address("R cube Properties", "Hyderabad");
		return address;
	}
	
	@Bean( name ="address3")
	@Qualifier("address3qulifier")
	public Address address3() {
		var address = new Address("R cube Properties", "Hyderabad");
		return address;
	}

}
