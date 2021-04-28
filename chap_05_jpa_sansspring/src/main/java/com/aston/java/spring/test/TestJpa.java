package com.aston.java.spring.test;

import javax.persistence.Persistence;

import com.aston.java.spring.utils.JpaUtils;

public class TestJpa {

	public static void main(String[] args) {
		Persistence.generateSchema("MYSQL_ASTON_PU", null);

	}
	
}
