package com.org;

import org.springframework.stereotype.Service;

@Service
public class ServiceClass {

	public void store() {
		System.out.println("Service Layer store is executed");
	}
	public void getEmployee(int id)
	{
		System.out.println("getEmp() method.....");
	}
	public void getAllEmployees()
	{
		System.out.println("getAllEmp() method ....");
	}
	public int updateEmployees(int id)
	{
		System.out.println("updateEmp() method....");
		return 1;
	}
	public String displayname()
	{
		System.out.println("display() name");
		return "sudeepa";
	}
	public void method1(int id, String name) {
		System.out.println("int,string params method");
	}
	
	
	
}
