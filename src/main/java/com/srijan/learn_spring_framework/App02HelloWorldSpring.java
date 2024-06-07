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
		
		
	}

}
