package com.aston.java.spring.dao.javaconfig.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.aston.java.spring.dao.AppConfig;
import com.aston.java.spring.dao.javaconfig.CompteService;
import com.aston.java.spring.domains.Compte;

public class TestJavaConfig {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(AppConfig.class)) {
			
			 CompteService service = (CompteService) context.getBean("compteService");

	            System.out.println("\nAVANT LE TRANSFERT\n");
	            System.out.printf("s1 = %s\n", service.getCompte(1).getSolde());
	            System.out.printf("s3 = %s\n", service.getCompte(3).getSolde());

	            service.transfert(3, 1, 50.);

	            System.out.println("\nAPRES LE TRANSFERT\n");
	            System.out.printf("s1 = %s\n", service.getCompte(1).getSolde());
	            System.out.printf("s3 = %s\n", service.getCompte(3).getSolde());
	            

	            System.out.println("\nRECHERCHE DU BEAN\n");
	            
	            Compte compte = context.getBean(Compte.class);
	            System.out.printf("Resultat = %s\n", compte);
			
		}

	}

}
