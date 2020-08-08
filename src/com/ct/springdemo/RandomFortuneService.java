package com.ct.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	String[] fortunes = {"Good","Bad","Neutral"};

	@Override
	public String getFortune() {
		int index = (int) Math.floor(Math.random()*3);
		return fortunes[index];
	}

}
