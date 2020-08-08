package com.ct.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {
	private String fileName = "C:/Users/User/workspace/spring-annotations/input.txt";
	private List<String> fortunes;
	
	@Override
	public String getFortune() {
		int index = (int)Math.floor(Math.random()*5);
		return fortunes.get(index);
	}
	
	@PostConstruct
	public void loadFile()  throws FileNotFoundException {
		File file = new File(fileName);
		BufferedReader br = new BufferedReader(new FileReader(file));
		fortunes = new ArrayList<String>();
		String tempLine;
		try {
			while((tempLine = br.readLine())!=null)
				fortunes.add(tempLine);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
