package com.examples.S05SpringJdbcDemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.examples.S05SpringJdbcDemo.entity.Employee;

@Component("employeedao")
public class EmployeeDaoImpl implements EmployeeDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee employee) {
		
		String sql ="insert into employee values(?,?,?)";
    	int result = jdbcTemplate.update(sql,employee.getId(),employee.getFirstName(),employee.getLastName());
    	
    	
		return result;
	}

	@Override
	public int update(Employee emp) {

		String sql ="update employee set firstname=?, lastname=? where id=?";
    	int result = jdbcTemplate.update(sql,emp.getFirstName(),emp.getLastName(),emp.getId());
		return result;
	}

	@Override
	public int delete(int id) {
		String sql ="delete from employee where id=?";
    	int result = jdbcTemplate.update(sql,id);
    	
    	
		return result;
	}

	@Override
	public Employee read(int id) {
		String sql ="select * from employee where id=?";
		EmployeeRowMapper employeeRowMapper = new EmployeeRowMapper();
		Employee employee =jdbcTemplate.queryForObject(sql, employeeRowMapper, id);
		return employee;
	}

	@Override
	public List<Employee> read() {
		String sql ="select * from employee ";
		EmployeeRowMapper employeeRowMapper = new EmployeeRowMapper();
		List<Employee>employees =jdbcTemplate.query(sql, employeeRowMapper);
		return employees;
	}

}
