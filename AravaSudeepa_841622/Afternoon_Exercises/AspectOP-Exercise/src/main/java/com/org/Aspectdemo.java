package com.org;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aspectdemo {

	//can have multiple advice here
	@Before("execution(public void com.org.ServiceClass.store())")
	public void logger()
	{
	   System.out.println("Logger() is executed and it is an advice");
	}
	
	@Before("execution(public void com.org.ServiceClass.*(int))")
	public void log1()
	{
		System.out.println("log1() method ,advice to take only int param methods only");
	}
	
	@Before("execution(public * com.org.ServiceClass.*(int,String))")
	public void log2()
	{
		System.out.println("log2() ,takes methods with int,string params");
	}
	@Before("execution(public * com.org.ServiceClass.*(int,*))")
	public void log3()
	{
		System.out.println("log3().takes int,any other params");
	}
	@Before("execution(public String com.org.ServiceClass.*(..))")
	public void log4()
    {
		System.out.println("log4() takes any params with string return type");
	}
	
	
}
