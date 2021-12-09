package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileReaderFortune implements FortuneService {
	
	private List<String> sports;
	private Random random = new Random();

	@PostConstruct
	public void postConstruct(){
		sports = new ArrayList<>();
		File file = new File("src/resources/sports.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		       // process the line.
		    	sports.add(line);
		    }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public String getFortune() {
		int index = random.nextInt(sports.size());
		return sports.get(index);
	}

}
