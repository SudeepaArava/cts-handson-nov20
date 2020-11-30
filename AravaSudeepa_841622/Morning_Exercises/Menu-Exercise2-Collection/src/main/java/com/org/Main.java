package com.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Account acc=new Account();
		Service service = new Service();
		Scanner sc=new Scanner(System.in);
		List<Account> list = new ArrayList<Account>();
		int op;
		do {
			System.out.println("Enter your option from the menu:");
			System.out.println("1. Add\n2. Remove Account by Account num\n"
					+ "3. Display Account by Account num\n4. Displa all Accounts by Accout Num\n"+
					"5. Dsplay Acount having balance less than 1000\n6. Exit ");
			op= sc.nextInt();
		switch(op)
		{
		case 1: int num=0;
		  try {
			  System.out.println("Enter Id:");
			  num=sc.nextInt();
		      if(list.contains(num))
			     throw new AccountAlreadyException("Account already exists");
		     }
		  catch(Exception al){
			  System.out.println(al);
		  }
	      System.out.println("Enter Name: ");
	      String name=sc.next();
	      System.out.println("Enter Amount: ");
	      long amount =sc.nextLong();
	      Account ac=new Account(num,name,amount);
	      service.addAccount(ac);
	      break;
	    
		case 2: System.out.println("Enter account Number to delete");
		        int no=sc.nextInt();
		        Account a=null;
		        System.out.println("The account details are:");
		        try {
		        	a=service.displayAccount(no);
		        	if(a == null)
		        		throw new AccountNotFound("Account is not present");
		        }
		        catch(Exception e) {
		        	System.out.println(e);
		        }
		        System.out.println(a);
		        List<Account> f=service.deleteAccount(no);
		        System.out.println("deleted account: "+f);
		        break;
		case 3: System.out.println("Enter account Number to dsplay details:");
		        int num1=sc.nextInt();
		        Account b=service.displayAccount(num1);
		        try {
		        	if(b == null)
		        		throw new AccountNotFound("Account is not present");
		        }
		        catch(Exception e)
		        {
		        	System.out.println(e);
		        }
		        System.out.println("Details are: "+b);
		        break;
		case 4: List<Account> d=service.getAccounts();
		       System.out.println(d);
		       break;
		case 5:System.out.println("Account having balance less than 1000");
		       List<Account> c=service.accountLessBalance();
		       System.out.println(c);
		       break;
		 
		case 6:System.out.println("Exiting from menu....... ");
		       System.exit(0); 
		       break; 
		}

	     }while(op <= 6);
  
   }
}
