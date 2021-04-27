package com.aston.java.spring.dao;

import com.aston.java.spring.domains.Compte;

public interface ICompteService {
	
	void transfert(Integer numSource, Integer numDestinataire, Double montant);
	
	void crediter(Integer numero, Double montant);
	
	Compte getCompte(Integer numero);

}
