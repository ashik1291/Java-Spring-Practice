package com.annotationsjavacode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {
        // read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
        // get the bean
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        // call a method
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getEmail());
        System.out.println(theCoach.getTeam());

        //close the context
        context.close();
    }
}
