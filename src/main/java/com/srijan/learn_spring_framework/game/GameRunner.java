package com.srijan.learn_spring_framework.game;

public class GameRunner {
	
	MarioGame game;
	
	SuperContraGame superContraGame;
	
	public GameRunner(MarioGame game) {
		this.game = game;
	}
	
	public GameRunner(SuperContraGame superContraGame) {
		this.superContraGame = superContraGame;
	}

	public void run() {
		System.out.println("Running game:" + game);
		
		game.down();
		game.up();
		game.left();
		game.right();
	}
	
	public void fight() {
		System.out.println("Running game:" + superContraGame);
		
		superContraGame.down();
		superContraGame.up();
		superContraGame.left();
		superContraGame.right();
	}

}
