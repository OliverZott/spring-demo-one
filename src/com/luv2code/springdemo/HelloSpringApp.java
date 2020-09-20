package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring context
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // cal methods on the bean
        /* Usage of interface for type-safety
        https://www.udemy.com/course/spring-hibernate-tutorial/learn/lecture/5672766#overview
         */
        System.out.println("HelloSpringApp talking here: " + theCoach.getDailyWorkout());

        // close the context
        context.close();

    }
}