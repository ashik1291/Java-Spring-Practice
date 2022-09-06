package com.annotationAutowired;

import com.annotationsSpring.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemoApp {
    public static void main(String[] args) {

        // load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get bean from spring container
        TheCoach theCoach = context.getBean("soccerTheCoach", TheCoach.class);

        //call method on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
