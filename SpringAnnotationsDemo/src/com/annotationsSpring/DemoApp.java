package com.annotationsSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoach = context.getBean("tennisCoachDefaultBean", Coach.class);

        System.out.println(theCoach.getDailyWorkout());
        context.close();
    }
}
