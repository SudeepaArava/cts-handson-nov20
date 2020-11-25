package com.org;

public class EmployeeDaoImpl implements EmployeeDao {

     private DbConfig dbConfig;
     
     public void setDbConfig(DbConfig dbConfig) {
 		this.dbConfig = dbConfig;
 	 }
     
     @Override
	 public void store() {
		
		System.out.println("store() method");
		System.out.println("DBName :"+dbConfig.getDbname()+", DB Url: "+dbConfig.getDbUrl());
		
	}

	public EmployeeDaoImpl() {
		super();
	}

	public EmployeeDaoImpl(DbConfig dbConfig) {
		this.dbConfig = dbConfig;
	}

}
