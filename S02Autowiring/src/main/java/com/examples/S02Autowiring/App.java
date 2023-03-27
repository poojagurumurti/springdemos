package com.examples.S02Autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	 ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/examples/S02Autowiring/springconfig.xml");
    	 Employee emp= (Employee) ctx.getBean("emp");
    	 System.out.println(emp);
    	 
    }
}
