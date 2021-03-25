package com.lti.view;

import com.lti.model.Employee;

public class EmpView {
	
	public static void main(String [] args){
		Employee emp=new Employee();
		emp.setEmpid(1003);
		emp.setEmpname("Poll SCM");
		
		System.out.println("ID: "+emp.getEmpId());
		System.out.println("Name: "+emp.getEmpname());
		
	}

}
