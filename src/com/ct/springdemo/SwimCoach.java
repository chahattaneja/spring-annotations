package com.ct.springdemo;

public class SwimCoach implements Coach {
	
	FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "swim 1000m";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
