package com.jp.hr.services;

import java.util.ArrayList;
import java.util.List;

import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;

public interface Role1 {

	public List<Employee> getEmpList() throws HrException;
	
	public Employee getEmpDetails(Integer empId) throws HrException;
		
}
