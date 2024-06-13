package com.srijan.learn_spring_framework.examples.c1;

import java.util.Arrays;import javax.xml.crypto.Data;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class BusinessCalculationService {
	
	private DataService dataService;
	
	public BusinessCalculationService(DataService dataService) {
		super();
		this.dataService = dataService;
	}
	
	public int findMax() {
		return Arrays.stream(dataService.retireveData()).max().orElse(0);
	}

}
