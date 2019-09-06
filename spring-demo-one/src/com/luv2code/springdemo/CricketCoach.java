 package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	//create non-arg constructor
	public CricketCoach() {
		System.out.println("Cricket Coach: inside no-arg constructor");
	} 

	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket coach inside setter method");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	public String getEmailAddress() {
		return this.emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket coach: inside setter method set emailAddress");
		this.emailAddress = emailAddress;
	}
 
	public String getTeam() {
		return this.team;
	}
	public void setTeam(String team) {
		System.out.println("Cricket coach: inside setter method set team ");
		this.team = team;
	}

}
