package com.srijan.learn_spring_framework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {
	
	public void up() {
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("Go into the hole");
	}
	
	public void left() {
		System.out.println("go Forward");
	}
	
	public void right() {
		System.out.println("go Backward");
	}

}
