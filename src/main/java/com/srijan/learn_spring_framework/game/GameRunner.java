package com.srijan.learn_spring_framework.game;

public class GameRunner {
	
	MarioGame game;
	
	public GameRunner(MarioGame game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Running game:" + game);
		
		game.down();
		game.up();
		game.left();
		game.right();
		
	}

}
