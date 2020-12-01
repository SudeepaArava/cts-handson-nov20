package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAspect {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ServiceClass service = (ServiceClass)context.getBean("serviceClass");
		service.store();
		service.getEmployee(2);
		service.getAllEmployees();
		service.updateEmployees(5);
		service.method1(1, "sudeepa");
		service.displayname();
	}

}
