package com.org;

public class AccountAlreadyException extends Exception{

	String str1;
	AccountAlreadyException(String str2)
	{
		str1=str2;
	}
}
