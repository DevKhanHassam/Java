package com.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Body {

    @Autowired
    private Heart heart;


    public Body()
    {}
    public Body(Heart heart) {
        this.heart = heart;
    }

    //    public void setHeart(Heart heart) {
//        this.heart = heart;
//    }

    public void isAlive()
    {
        if(heart==null)
        {
            System.out.println("You are dead");
        }
        else
        {
            heart.Beat();
        }
    }
}
