package com.srijan.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.srijan.learn_spring_framework.game.GameRunner;
import com.srijan.learn_spring_framework.game.GamingConsole;
import com.srijan.learn_spring_framework.game.MarioGame;
import com.srijan.learn_spring_framework.game.PacmanGame;
import com.srijan.learn_spring_framework.game.SuperContraGame;


@Configuration
@ComponentScan("com.srijan.learn_spring_framework.game")
public class App03GamingSpringBeans {
	
//	@Bean
//	public GamingConsole game() {
//		var game = new PacmanGame();
//		return game;
//	}
//	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}

	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(App03GamingSpringBeans.class)) {
			
//			System.out.println(context.getBean("game"));
			
			context.getBean(GamingConsole.class).left();
			
			System.out.println(context.getBean(GameRunner.class));
			
			context.getBean(GameRunner.class).run();
			
		}

		
	}

}
