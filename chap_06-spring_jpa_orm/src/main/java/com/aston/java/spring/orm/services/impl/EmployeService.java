package com.aston.java.spring.orm.services.impl;

import java.util.List;

import com.aston.java.spring.orm.repositories.IEmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aston.java.spring.orm.domains.Employe;
import com.aston.java.spring.orm.services.IEmployeService;

@Service
@Transactional
public class EmployeService implements IEmployeService {

	@Autowired
	private IEmployeRepository repository;
	
	@Override
	public List<Employe> allEmployes() {
		return repository.allEmployes();
	}

	@Override
	public Employe addEmploye(Employe employe) {
		return repository.addEmploye(employe);
	}
	

}
