package com.srijan.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.srijan.learn_spring_framework.game.GameRunner;
import com.srijan.learn_spring_framework.game.GamingConsole;

@Configuration
@ComponentScan("com.srijan.learn_spring_framework.game")
public class GamingAppLauncherApplication {

	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
					(GamingAppLauncherApplication.class)) {
			
			context.getBean(GamingConsole.class).left();
			
			context.getBean(GameRunner.class).run();
			
		}

		
	}

}
