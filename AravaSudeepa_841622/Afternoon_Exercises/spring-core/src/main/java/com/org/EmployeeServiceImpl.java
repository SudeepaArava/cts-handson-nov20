package com.org;

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDao employeeDao;
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	@Override
	public void storeEmployee() {
		
		System.out.println("storeEmployee of service");
		employeeDao.store();
		
	}
	
}
