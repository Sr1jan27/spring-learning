package com.srijan.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.srijan.learn_spring_framework.game.GameRunner;
import com.srijan.learn_spring_framework.game.MarioGame;
import com.srijan.learn_spring_framework.game.PacmanGame;
import com.srijan.learn_spring_framework.game.SuperContraGame;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		//1: Launch a spring context-
		var context = 
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		//2: Configure the things that we want spring to manage- @Configuration
		
		// HelloWorldConfirhuration Class -@Confirguration
		//name-@Bean
		
//		//3: Retrieving Beans Managed by Spring
//		System.out.println(context.getBean("name"));
//		
//		System.out.println(context.getBean("age"));
//		
//		System.out.println(context.getBean("person"));
//		
//		System.out.println(context.getBean("person2MethodCall"));
//		
//		System.out.println(context.getBean("person3Parameters"));
////		
//		System.out.println(context.getBean("address2"));
//		
//		System.out.println(context.getBean(Address.class));
//		
		
	}

}
