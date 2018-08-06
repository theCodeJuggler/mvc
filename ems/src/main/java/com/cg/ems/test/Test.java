package com.cg.ems.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.ems.bean.Employee;
import com.cg.ems.dao.EmployeeDAO;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		EmployeeDAO dao = context.getBean(EmployeeDAO.class);
		
		System.out.println(dao.findByEmpIdOrEmpName(102, "Satyen12"));
		
//		dao.save(new Employee(101, "Satyen12"));
//		dao.save(new Employee(102, "Satyen232"));
//		dao.save(new Employee(103, "Satyen232"));
//		dao.save(new Employee(104, "Satyen45"));
		
//		List<Employee> employees = dao.findAll();
//		for (Employee employee : employees) {
//			System.out.println(employee);
//		}
//		
//		System.out.println(dao.count());
		
	}
}