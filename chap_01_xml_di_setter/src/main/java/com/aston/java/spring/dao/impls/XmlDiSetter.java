package com.aston.java.spring.dao.impls;

import java.util.Arrays;

import com.aston.java.spring.dao.impls.CompteService;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class XmlDiSetter {

	public static void main(String[] args) {
		/*
		 * Map<Integer, Compte> comptes = new HashMap<>();
		 * 
		 * CompteRepository repository = new CompteRepository(); CompteService service =
		 * new CompteService();
		 * 
		 * epository.setComptes(comptes);
		 * service.setCompteRepository(Repository);
		 */
		try(AbstractApplicationContext context = new  ClassPathXmlApplicationContext("DiSetterXmlConfig.xml")) {
		
		int nbBeans = context.getBeanDefinitionCount();
		System.out.printf("NB Beans = %s%n", nbBeans);
		
		var listBeans = context.getBeanDefinitionNames();
        System.out.println(Arrays.toString(listBeans));
        
        CompteService service = (CompteService) context.getBean("compteService");
		
	
		System.out.println("\nAvant le trasnfert\n" );
		System.out.printf("s1 = %s\n", service.getCompte(1).getSolde());
		System.out.printf("s2 = %s\n", service.getCompte(2).getSolde());
		//System.out.println("s3 = " + service.getCompte(3).getSolde());
		
		service.transfert(2, 1, 500.);
		
		System.out.println("\nAprès le trasnfert\n" );
		System.out.printf("s1 = %s\n", service.getCompte(1).getSolde());
		System.out.printf("s2 = %s\n", service.getCompte(2).getSolde());
		}
	}

}
