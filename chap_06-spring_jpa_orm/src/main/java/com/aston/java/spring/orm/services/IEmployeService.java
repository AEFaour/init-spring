package com.aston.java.spring.orm.services;

import java.util.List;

import com.aston.java.spring.orm.domains.Employe;

public interface IEmployeService {
	
	List<Employe> allEmployes();

	Employe addEmploye(Employe employe);
	
}
