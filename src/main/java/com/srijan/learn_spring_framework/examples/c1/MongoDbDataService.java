package com.srijan.learn_spring_framework.examples.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataService implements DataService {

	@Override
	public int[] retireveData() {
		int[] a = new int[] {11,22,33,44,55};
		return a;
	}
	
	

}
