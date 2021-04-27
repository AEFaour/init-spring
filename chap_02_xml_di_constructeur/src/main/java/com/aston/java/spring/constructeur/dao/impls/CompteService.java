package com.aston.java.spring.constructeur.dao.impls;

import com.aston.java.spring.dao.ICompteRepository;
import com.aston.java.spring.dao.ICompteService;
import com.aston.java.spring.domains.Compte;

public class CompteService implements ICompteService{
	
	private CompteRepository compteRepository; 
	
	
	
	public CompteService(CompteRepository compteRepository) {
		
		this.compteRepository = compteRepository;
	}

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
