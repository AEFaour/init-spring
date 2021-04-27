package com.aston.java.spring.domains;

public class TestIoc {

	public static void main(String[] args) {
		Compte compte = new Compte(null, null, null, null, false);
		Personne personne = new Personne(compte);

	}

}
