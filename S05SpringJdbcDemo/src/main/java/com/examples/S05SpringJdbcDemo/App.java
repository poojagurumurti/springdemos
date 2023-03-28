package com.examples.S05SpringJdbcDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.examples.S05SpringJdbcDemo.dao.EmployeeDAO;
import com.examples.S05SpringJdbcDemo.entity.Employee;


public class App 
{
    public static void main( String[] args )
    {
    	
//    	create();
//    	update();
    	delete();
		
    }

	private static void delete() {
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/examples/S05SpringJdbcDemo/springconfig.xml");
    	
    	EmployeeDAO employeeDao =(EmployeeDAO) ctx.getBean("employeedao");
   		
   		employeeDao.delete(2);		
	}

	private static void update() {
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/examples/S05SpringJdbcDemo/springconfig.xml");
    	
    	EmployeeDAO employeeDao =(EmployeeDAO) ctx.getBean("employeedao");
   		Employee emp = new Employee();
   		emp.setId(2);
   		emp.setFirstName("Trigun");
   		emp.setLastName("Gurumurti");
   		
   		employeeDao.update(emp);
		
	}

	private static void create() {
		System.out.println("JDBCTemplate Demo");
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("com/examples/S05SpringJdbcDemo/springconfig.xml");
    	
    	EmployeeDAO employeeDao =(EmployeeDAO) ctx.getBean("employeedao");
   		Employee emp = new Employee();
   		emp.setId(2);
   		emp.setFirstName("Trigun");
   		emp.setLastName("G");
   		employeeDao.create(emp);
	}
}
