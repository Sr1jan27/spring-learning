package com.srijan.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	GamingConsole game;
	
	public GameRunner(@Qualifier("UperContraGameQualifier") GamingConsole game) {
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
