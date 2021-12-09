package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class ChessCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Defend your queen";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
