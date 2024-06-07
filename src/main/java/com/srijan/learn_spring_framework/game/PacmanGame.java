package com.srijan.learn_spring_framework.game;

public class PacmanGame implements GamingConsole{
	
	public void up() {
		System.out.println("PacMan Jump");
	}
	
	public void down() {
		System.out.println("Go PacMan into the hole");
	}
	
	public void left() {
		System.out.println("go PacMan Forward");
	}
	
	public void right() {
		System.out.println("go PacMan Backward");
	}

}
