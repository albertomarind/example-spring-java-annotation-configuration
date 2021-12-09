package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	//@Qualifier("dbs")
	@Qualifier("fileReaderFortune")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("TennisCoach: Inside default constructor");
	}
	
//	@Autowired
//	public void setFortuneService(FortuneService theFortuneService) {
//		System.out.println("TennisCoach: Inside setFortuneService() method");
//		this.fortuneService = theFortuneService;
//	}
	
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService theFortuneService) {
//		System.out.println("TennisCoach: Inside doSomeCrazyStuff() method");
//		this.fortuneService = theFortuneService;
//	}
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
	
	// define my init method
	
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("Inside of PostConstruct");
	}
	
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("Inside of PreDestroy");
	}
	
	//define my destroy method
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
