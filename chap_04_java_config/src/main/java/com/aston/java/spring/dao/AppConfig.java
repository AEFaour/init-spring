package com.aston.java.spring.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.aston.java.spring.domains.Compte;

@Configuration
@ComponentScan("com.aston.java.spring")
public class AppConfig {
	
	@Bean
	public Compte getCompte() 
	{
		Compte compte = new Compte(12, "Loudjai", 4500. );
		return compte;
	}

}
