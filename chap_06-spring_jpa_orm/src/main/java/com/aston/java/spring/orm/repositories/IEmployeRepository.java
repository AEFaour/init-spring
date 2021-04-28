package com.aston.java.spring.orm.repositories;

import java.util.*;

import com.aston.java.spring.orm.domains.Employe;

public interface IEmployeRepository {
	List<Employe> allEmployes();
	
	Employe addEmploye(Employe employe); 

}
