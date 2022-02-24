package com.lab0.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Greeter greet = (Greeter)context.getBean("greeter");
        System.out.println(greet.getGreeting());
        
    }
}
