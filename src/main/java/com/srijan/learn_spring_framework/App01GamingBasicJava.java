package com.srijan.learn_spring_framework;

import com.srijan.learn_spring_framework.game.GameRunner;
import com.srijan.learn_spring_framework.game.MarioGame;
import com.srijan.learn_spring_framework.game.PacmanGame;
import com.srijan.learn_spring_framework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		
//		var game = new MarioGame();
		var game = new PacmanGame(); // 1: Object Creation 
//		var game = new SuperContraGame();
		
		
		var gameRunner = new GameRunner(game); 
		//2: Object Creation + Wiring of dependencies
		//game is a Dependency of GameRunner
		
		gameRunner.run();
		
	}

}
