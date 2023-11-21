package com.staticvalue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Student {

    private int rollNo;
    private String name;


    public Student(@Autowired(required = true) @Value("${Student.rollNo}") int rollNo, @Value("${Student.name}") String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void show()
    {
        System.out.println("Your rollNO="+rollNo);
        System.out.println("Your name="+name);
    }
}
