package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Human {
    public static void main(String args[])
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        Body body = context.getBean("Body", Body.class);
        body.isAlive();

    }
}
