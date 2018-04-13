package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach basketballCoach = context.getBean("myBasketballCoach", Coach.class);
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//new methods for fortunes
		System.out.println(theCoach.getDailyFortune());
		System.out.println(basketballCoach.getRandomFortune());
		
		//close the context
		context.close();
	}

}
