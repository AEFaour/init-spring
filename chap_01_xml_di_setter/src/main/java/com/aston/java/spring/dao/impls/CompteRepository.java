package com.aston.java.spring.dao.impls;

import java.util.HashMap;
import java.util.*;
import java.util.Map;

import com.aston.java.spring.dao.ICompteRepository;
import com.aston.java.spring.domains.Compte;

public class CompteRepository implements ICompteRepository {

	private Map<Integer, Compte> comptes = new HashMap<>();
	
	

	public void setComptes(Map<Integer, Compte> comptes) {
		this.comptes = comptes;
	}

	@Override
	public void insert(Compte compte) {

		if (!comptes.containsKey(compte.getNumero())) {

			comptes.put(compte.getNumero(), compte);
		}

	}

	@Override
	public void update(Compte compte) {
		if (comptes.containsKey(compte.getNumero())) {

			comptes.put(compte.getNumero(), compte);
		}

	}

	@Override
	public void update(List<Compte> comptes) {

		for (Compte compte : comptes) {
			update(compte);
		}

	}

	@Override
	public void delete(Integer numero) {
		if (comptes.containsKey(numero)) {
			comptes.remove(numero);
		}
	}

	@Override
	public Compte find(Integer numero) {

		Compte compte = new Compte();

		if (comptes.containsKey(numero)) {
			compte = comptes.get(numero);
		}

		return compte;
	}

	@Override
	public List<Compte> find(List<Integer> numeros) {

		List<Compte> comptes = new ArrayList<>();
		for (Integer numero : numeros) {
			if (find(numero) != null) {
				comptes.add(find(numero));
			}

		}

		/*
		 * for (Integer numero : numeros) {
		 * 
		 * find(numero); } return (List<Compte>) comptes;
		 */

		return null;
	}

	@Override
	public List<Compte> find(String titulaire) {

		/*
		 * List<Compte> compteList = (List<Compte>) comptes; List<Compte> tC = new
		 * ArrayList<>();
		 * 
		 * for (Compte compte : compteList) {
		 * 
		 * if (compte.getTitulaire().equalsIgnoreCase(titulaire)) { tC.add(compte); } }
		 */
		;
		List<Compte> comptes = new ArrayList<Compte>();

		for (int key : this.comptes.keySet()) {
			if (comptes.get(key).getTitulaire().equalsIgnoreCase(titulaire)) {
				comptes.add(comptes.get(key));
			}
		}

		return comptes;
	}

	@Override
	public List<Compte> find(Boolean fermer) {

		List<Compte> comptes = new ArrayList<Compte>();

		for (Compte compte : this.comptes.values()) {
			if (Objects.equals(compte.getFermer(), fermer)) {
				comptes.add(compte);
			}
		}

		return comptes;
		/*
		 * List<Compte> compteList = (List<Compte>) comptes; List<Compte> tC = new
		 * ArrayList<>();
		 * 
		 * for (Compte compte : compteList) {
		 * 
		 * if (compte.isFermer() == fermer) { tC.add(compte); } }
		 * 
		 * return tC;
		 */
	}
}
