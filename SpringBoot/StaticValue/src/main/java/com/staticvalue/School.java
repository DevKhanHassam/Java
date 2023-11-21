package com.staticvalue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class School
{
    public static void main(String args[])
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");

        Student s1= context.getBean("Student",Student.class);
        s1.show();
    }

}
