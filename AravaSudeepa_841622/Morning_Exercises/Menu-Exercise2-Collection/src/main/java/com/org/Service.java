package com.org;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Service {

	List<Account> accountlist =new ArrayList<Account>();
	public void addAccount(Account ac)
	{
		accountlist.add(ac);
	}
	
	public List<Account> deleteAccount(int num)
	{
		
		List<Account> acc=new ArrayList<Account>();
		acc =accountlist.stream().filter(e -> e.getAccNo()== num)
				.collect(Collectors.toList());
		return acc;
	}

	public Account displayAccount(int no) {
		for(Account acc:accountlist)
		{
			if((acc.getAccNo())== no)
				return acc;
		}
		return null;
	}
	public List<Account> getAccounts()
	{
		return accountlist;
	}
	public List<Account> accountLessBalance() {
 
		List<Account> acc=new ArrayList<Account>();
		acc =accountlist.stream().filter(e -> e.getAmount() < 1000)
				.collect(Collectors.toList());
		  return acc;
	}
}