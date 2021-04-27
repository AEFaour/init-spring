package com.aston.java.spring.dao;

import java.util.List;

import com.aston.java.spring.domains.Compte;

public interface ICompteRepository {

	void insert(Compte compte);
	
	void update(Compte compte);
	
	void update(List<Compte> comptes);
	
	void delete(Integer numero);
	
	Compte find(Integer numero);
	
	List<Compte> find(List<Integer> numeros);
	
	List<Compte> find(String titulaire);
	
	List<Compte> find(Boolean fermer);
}


