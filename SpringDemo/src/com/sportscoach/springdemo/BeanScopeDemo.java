package com.sportscoach.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
    public static void main(String[] args) {
        // load the spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        // retrieve the bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);
        // check if they are same
        boolean result = (theCoach == alphaCoach);
        System.out.println("Pointing to the same object: "+ result);
        System.out.println("Memory location of theCoach: "+ theCoach);
        System.out.println("Memory location of alphaCoach: "+alphaCoach );

        //close context
        context.close();
    }
}
