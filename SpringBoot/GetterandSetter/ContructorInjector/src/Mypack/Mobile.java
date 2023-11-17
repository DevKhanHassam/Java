package Mypack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String args[])
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Mypack/Bean.xml");
        Sim sim1 = context.getBean("simObj1",Sim.class);
        Sim sim2 =context.getBean("simobj2",Sim.class);


        sim1.show();
        sim2.show();
    }
}
