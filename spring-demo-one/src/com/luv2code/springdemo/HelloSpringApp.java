package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//load the cpring cofiguration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retreive bean from spring container
		Coach baseballCoach = context.getBean("baseballCoach", Coach.class);
		
		
		//call methods on bean
		System.out.println(baseballCoach.getDailyFortune());
		System.out.println(baseballCoach.getDailyWorkout());
		//close the context
		context.close();

	}

}
