package com.srijan.learn_spring_framework.game;

public class SuperContraGame implements GamingConsole {
	public void up() {
		System.out.println("Shoot");
	}
	
	public void down() {
		System.out.println("Go into the Shade");
	}
	
	public void left() {
		System.out.println("Fight Forward");
	}
	
	public void right() {
		System.out.println("Fight Backward");
	}

}
