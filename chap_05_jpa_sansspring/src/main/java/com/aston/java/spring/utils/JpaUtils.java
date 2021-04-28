package com.aston.java.spring.utils;

import java.time.LocalDate;
import java.time.Period;

public class JpaUtils {

	// public static boolean isNullOrEmpty(String chaine){}
	// public static String capitalise(String chaine){return mot}
	// public static int calculeAge(LocalDate ddn){}

	public static boolean isNullOrEmpty(String chaine) {

		//return chaine == null || chaine.length() == 0;
		return chaine == null || chaine.trim().isBlank();
	}

	public static String capitalise(String chaine){
		
		return chaine.toUpperCase().substring(0, 1)+ chaine.toLowerCase().substring(1) ;
	}
	
	public static int calculeAge(LocalDate ddn){
		LocalDate now = LocalDate.now(); 
		
		return Period.between(now, ddn).getYears();
	}
}

