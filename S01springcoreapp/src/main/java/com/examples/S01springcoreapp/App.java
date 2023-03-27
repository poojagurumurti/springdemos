package com.examples.S01springcoreapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//        demo1();
        
//        demo2();
    	
    	demo3();
 
        
    }

	private static void demo3() {
		 ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/examples/S01springcoreapp/springconfig3.xml");
		 Computer c1=(Computer) ctx.getBean("homecomputer");
		 System.out.println(c1);
		 
		 Computer o1=(Computer) ctx.getBean("officecomputer");
		 System.out.println(o1);
		
	}

	private static void demo2() {
		 //create the spring container
        ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/examples/S01springcoreapp/springconfig2.xml");
        
        Car c1=(Car) ctx.getBean("car");
        System.out.println(c1.hashCode());
        
        
//        Car c2=c1;
        Car c2=(Car) ctx.getBean("car");
        System.out.println(c2.hashCode());
        
        Object b1= ctx.getBean("bank");
        System.out.println(b1.hashCode());
        
        Object b2= ctx.getBean("bank");
        System.out.println(b2.hashCode());
		
        
        Object b3= ctx.getBean("bank");
        System.out.println(b3.hashCode());
	}

	private static void demo1() {
		System.out.println( "Hello World!" );
        
        //Traditional way
//        Employee emp = new Employee();
//        emp.setId(1);
//        emp.setName("Pooja");
//        System.out.println(emp);
        
        //create the spring container
        ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/examples/S01springcoreapp/springconfig.xml");
        
        //ask the container for employee bean
        Employee e1= (Employee) ctx.getBean("emp1");
        System.out.println(e1);
        
        Employee e2= (Employee) ctx.getBean("emp2");
        System.out.println(e2);
        
        
        Employee e3= (Employee) ctx.getBean("emp3");
        System.out.println(e3);
 
        
        Employee e4= (Employee) ctx.getBean("emp4");
        System.out.println(e4);
        
        
      Employee e5= (Employee) ctx.getBean("emp5");
      System.out.println(e5);
      
      Employee e6= (Employee) ctx.getBean("emp6");
      System.out.println(e6);
      
      
      Employee e7= (Employee) ctx.getBean("emp7");
      System.out.println(e7);
	}
}
