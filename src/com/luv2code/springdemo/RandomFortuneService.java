package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	@Override
	public String getRandomFortune() {
		
		String[] randomFortunes = {"Today is your lucky day!", "Today is NOT your lucky day!", "Let me set you free!"};
		Random random = new Random();
		int index = random.nextInt(randomFortunes.length);
		
		return randomFortunes[index];
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return null;
	}	

}


