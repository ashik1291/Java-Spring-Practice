package com.sportscoach.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoCheck {
    public static void main(String[] args) {
        // create the config obj
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve bean from spring container
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

        //call methods on the bean
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());

        //close context
        context.close();
    }
}
