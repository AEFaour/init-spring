package com.aston.java.spring.annotation.dao.impls.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aston.java.spring.annotation.dao.impls.CompteService;

public class XmlDiAnnotationConfigTest {

	public static void main(String[] args) {
		 try (var context = new ClassPathXmlApplicationContext("DiAnnotationXmlConfig.xml")) {

	            CompteService service = (CompteService) context.getBean("compteService");

	            System.out.println("\nAVANT LE TRANSFERT\n");
	            System.out.printf("s1 = %s\n", service.getCompte(1).getSolde());
	            System.out.printf("s3 = %s\n", service.getCompte(3).getSolde());

	            service.transfert(3, 1, 50.);

	            System.out.println("\nAPRES LE TRANSFERT\n");
	            System.out.printf("s1 = %s\n", service.getCompte(1).getSolde());
	            System.out.printf("s3 = %s\n", service.getCompte(3).getSolde());
	        }

	}

}
