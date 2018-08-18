package com.durgasoft.dao;


import org.springframework.orm.hibernate3.HibernateTemplate;

import org.springframework.transaction.annotation.Transactional;

import com.durgasoft.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	
	String status="";
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	@Transactional
	@Override
	public String insertEmployee(Employee emp) {
		Integer in=(Integer)hibernateTemplate.save(emp);
		if(in==emp.getEno()) {
			status="SUCCESS";
		}else
		{
			status="FAILURE";
		}
		return status;
	}
	@Transactional
	@Override
	public Employee searchEmployee(int eno) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	@Override
	public String updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Transactional
	@Override
	public String deleteEmployee(int eno) {
		// TODO Auto-generated method stub
		return null;
	}

}
