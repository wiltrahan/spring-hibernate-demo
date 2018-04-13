package com.luv2code.springdemo;

public class BasketballCoach implements Coach {
	
	FortuneService fortuneService;
	
	
	
	public BasketballCoach() {
	}
	
	

	public BasketballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		return "Shoot one thousand jumpers today.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRandomFortune() {
		// TODO Auto-generated method stub
		return "Random Hoop: " + fortuneService.getRandomFortune();
	}
}
