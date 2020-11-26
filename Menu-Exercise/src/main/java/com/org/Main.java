package com.org;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		EmployeeService service = new EmployeeService();
		Scanner sc=new Scanner(System.in);
		List<Employee> list = new ArrayList<Employee>();
		int op;
		do {
			System.out.println("Enter your option from the menu:");
			System.out.println("1. Add \n 2.Display By Id\n 3.Display All\n4. Sort by Id \n"+
					"5. Sort By Name \n 6. Sort By Salary \n 7. Sort By DOB \n 8. Exit ");
			op= sc.nextInt();
		switch(op)
		{
		case 1:
			System.out.println("Enter Id:");
			  int id=sc.nextInt();
		      System.out.println("Enter Name: ");
		      String name=sc.next();
		      System.out.println("Enter salary: ");
		      double salary =sc.nextDouble();
		      System.out.println("Enter DOB:");
		      String date= sc.next();
		      DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		      LocalDate dob=LocalDate.parse(date,formatter);
		      Employee employee=new Employee(id,name,salary,dob);
		      service.addEmployee(employee);
		      
		      break;
		case 2:System.out.println("Enter id of employee need to see details");
		      Employee em = service.findEmployee(sc.nextInt());
		      System.out.println("Details are: "+em.getName()+"\n "+em.getSalary()+
		    		  "\n "+em.getDob());
		      
		      break;
		case 3 :System.out.println("All employees list: ");
			    list = service.getEmployees();
			    for(Employee e:list)
			       System.out.println(e);
		        break;
		case 4:System.out.println("Sortedlist by Id: ");
		       list=service.getSortedEmployeesById();
		       list.forEach(e -> System.out.println(e));
		       break;
		case 5:System.out.println("sorted list by Name: ");
			   list= service.getSortedEmployeesByName();
		       list.forEach(e -> System.out.println(e));
			break;
		case 6:System.out.println("Sorted list by Salary");
		     list = service.getSortedEmployeesBySalary();
		     list.forEach(e -> System.out.println(e));
		     break;
		case 7: System.out.println("Sorted list by Dob");
		      list=service.getEmployeesByDob();
		      list.forEach(e -> System.out.println(e));
		      break;
		case 8:System.out.println("Exiting from menu....... ");
			System.exit(0); 
			  break; 
		}
		}
		while(op <= 8);
	}

}
