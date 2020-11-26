package com.org;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

	public String fetchDateTime() {
		return LocalDateTime.now().toString();
	}
}

