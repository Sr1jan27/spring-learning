package com.srijan.learn_spring_framework;

import com.srijan.learn_spring_framework.game.GameRunner;
import com.srijan.learn_spring_framework.game.MarioGame;
import com.srijan.learn_spring_framework.game.PacmanGame;
import com.srijan.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
		
//		var game = new MarioGame();
		var game = new PacmanGame();
//		var game = new SuperContraGame();
		
		
		var gameRunner = new GameRunner(game);
		
		gameRunner.run();
		
	}

}
