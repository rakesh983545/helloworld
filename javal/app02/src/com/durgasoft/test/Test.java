package com.durgasoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.Employee;
import com.durgasoft.dao.EmployeeDao;

public class Test {

	public static void main(String[] args) {
		
ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
EmployeeDao dao=(EmployeeDao) context.getBean("empDao");
Employee emp=new Employee();
emp.setEno(111);
emp.setEname("AAAA");
emp.setEsal(5000);
emp.setEaddr("dan");
String status=dao.insertEmployee(emp);
System.out.println(status);

	}

}
