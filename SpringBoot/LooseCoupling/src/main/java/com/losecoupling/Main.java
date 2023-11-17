package losecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[])
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("losecoupling/Mybean.xml");

        Student1 stu1= context.getBean("Student1", Student1.class);

        stu1.Cheating();
    }
}
