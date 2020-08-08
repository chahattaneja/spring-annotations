package com.ct.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	@Value("${bas.name}")
	private String name;
	@Value("${bas.team}")
	private String team;
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

	public String getName() {
		return name;
	}

	public String getTeam() {
		return team;
	}

}
