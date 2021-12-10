package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:alberto.properties")
public class AlbertoConfig {

	@Bean 
	public FortuneService myAlbertFortune() {
		return new MyAlbertFortune();
	}
	
	@Bean 
	public Coach albertoCoach() {
		return new AlbertoCoach(this.myAlbertFortune());
	}
}
