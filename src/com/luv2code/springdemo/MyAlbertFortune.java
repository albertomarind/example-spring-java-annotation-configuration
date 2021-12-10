package com.luv2code.springdemo;

public class MyAlbertFortune implements FortuneService {

	@Override
	public String getFortune() {
		return "this is an albert fortune";
	}

}
