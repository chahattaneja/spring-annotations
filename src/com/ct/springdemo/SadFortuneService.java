package com.ct.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "sad day";
	}

}
