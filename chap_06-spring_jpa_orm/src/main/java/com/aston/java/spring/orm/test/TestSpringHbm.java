package com.aston.java.spring.orm.test;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aston.java.spring.orm.AppConfig;
import com.aston.java.spring.orm.domains.Employe;
import com.aston.java.spring.orm.repositories.IEmployeRepository;
import com.aston.java.spring.orm.services.IEmployeService;
import com.aston.java.spring.orm.services.impl.EmployeService;

public class TestSpringHbm {

	public static void main(String[] args) {
		
		try( var context = new AnnotationConfigApplicationContext(AppConfig.class)){
			Employe joachim = new Employe();
			joachim.setPrenom("Joa");
			Employe ludovic = new Employe();
			ludovic.setPrenom("ludo");
			
			IEmployeService service =  context.getBean(EmployeService.class);
			service.addEmploye(joachim);
			service.addEmploye(ludovic);


			System.out.println(joachim);
			System.out.println(ludovic);
			
		}
		

	}

}
