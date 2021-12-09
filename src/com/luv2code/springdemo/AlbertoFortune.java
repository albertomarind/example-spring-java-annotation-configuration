package com.luv2code.springdemo;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class AlbertoFortune implements FortuneService {

	@Value("#{'${my.sport.properties}'.split(',')}")
	private List<String> listOfStrings;

	@Override
	public String getFortune() {
		Random rand = new Random(); 
		int upperbound = 3;
		int intRandom = rand.nextInt(upperbound);
		return listOfStrings.get(intRandom);
	}

}
