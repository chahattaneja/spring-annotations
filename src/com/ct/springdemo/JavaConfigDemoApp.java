package com.ct.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);
		
		TennisCoach coach = context.getBean("tennisCoach",TennisCoach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
//		System.out.println(coach.getName());
//		System.out.println(coach.getTeam());
		
		context.close();
	}

}
