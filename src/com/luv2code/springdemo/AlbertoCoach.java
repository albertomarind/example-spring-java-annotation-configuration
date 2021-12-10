package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class AlbertoCoach implements Coach {

	private FortuneService fortuneService;

	@Value("${alberto.address}")
	private String address;
	
	@Value("${alberto.country}")
	private String country;
	
	public AlbertoCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "albert dayly workout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getAddress() {
		return address;
	}

	public String getCountry() {
		return country;
	}

	
}
