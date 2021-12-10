package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AlbertoJavaConfigDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AlbertoConfig.class);
		
		AlbertoCoach coach = context.getBean("albertoCoach",AlbertoCoach.class);
		
		System.out.println("Alberto Fortune: "+coach.getDailyFortune());
		System.out.println("Alberto daily: " + coach.getDailyWorkout());
		System.out.println("Alberto address: " + coach.getAddress());
		System.out.println("Alberto country: " + coach.getCountry());
		
		context.close();
	}

}
