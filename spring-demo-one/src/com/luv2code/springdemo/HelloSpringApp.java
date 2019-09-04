package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//load the cpring cofiguration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retreive bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach brickCoach = context.getBean("brickCoach", Coach.class);
		Coach driverCoach = context.getBean("driverCoach", Coach.class);
		Coach esportCoach = context.getBean("esportCoach", Coach.class);
		
		//call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(brickCoach.getDailyWorkout());
		System.out.println(driverCoach.getDailyWorkout());
		System.out.println(esportCoach.getDailyWorkout());
		
		//close the context
		context.close();

	}

}
