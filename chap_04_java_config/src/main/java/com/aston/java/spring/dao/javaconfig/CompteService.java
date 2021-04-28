package com.aston.java.spring.dao.javaconfig;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aston.java.spring.dao.ICompteService;
import com.aston.java.spring.domains.Compte;

@Component
public class CompteService implements ICompteService{
	
	@Autowired
	private CompteRepository compteRepository; 
	

	@Override
	public void transfert(Integer numSource, Integer numDestinataire, Double montant) {

		Compte source = compteRepository.find(numSource);
		Compte destinataire = compteRepository.find(numDestinataire);
		source.setSolde(source.getSolde() - montant); ; 
		destinataire.setSolde(destinataire.getSolde() + montant);
		compteRepository.update(source);
		compteRepository.update(destinataire);
		
	}

	@Override
	public void crediter(Integer numero, Double montant) {
		
		
		Compte compte = compteRepository.find(numero);
		
		compte.setSolde(compte.getSolde() + montant);
		
		compteRepository.update(compte);
		
	}

	@Override
	public Compte getCompte(Integer numero) {
	      
		return compteRepository.find(numero);
	} 

}
