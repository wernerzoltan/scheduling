package com.example.demo;

import java.util.logging.Logger;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SomeTask {

	@Scheduled(cron = "1 * * * * *") //1 percenként fusson le
	public void someRegularChore() {
		
		Logger.getLogger("SomeTask").info("Megy");
	}
	
	@Scheduled(fixedDelay = 200) //200 ms-ként fut le
	public void anotherRegularChore() {
		
		Logger.getLogger("Some Task").info("Hello");
		
	}
	
}
