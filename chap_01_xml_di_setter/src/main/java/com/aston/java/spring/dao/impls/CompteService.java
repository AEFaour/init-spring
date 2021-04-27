package com.aston.java.spring.dao.impls;

import com.aston.java.spring.dao.ICompteService;
import com.aston.java.spring.domains.Compte;

public class CompteService implements ICompteService{
	
private CompteRepository compteRepository;



public void setCompteRepository(CompteRepository compteRepository) {
	this.compteRepository = compteRepository;
}

@Override
public void transfert(Integer numSource, Integer numDestinataire, Double montant) {

	 Compte source = compteRepository.find(numSource);
     Compte destination = compteRepository.find(numDestinataire);
     source.setSolde(source.getSolde() - montant);
     destination.setSolde(destination.getSolde() + montant);
     compteRepository.update(source);
     compteRepository.update(destination);
	
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
