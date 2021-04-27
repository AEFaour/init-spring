package com.aston.java.spring.domains;

import java.time.LocalDate;

public class Compte {
	private Integer numero;
	private String titulaire;
	private Double solde;
	private LocalDate dateAcces;
	private Boolean fermer;

	public Compte(Integer numero, String titulaire, Double solde, LocalDate dateAcces, Boolean fermer) {
		this.numero = numero;
		this.titulaire = titulaire;
		this.solde = solde;
		this.dateAcces = dateAcces;
		this.fermer = fermer;
	}

	

	public Compte(Integer numero, String titulaire, Double solde) {
		this(numero, titulaire, solde, null, null);
	}



	public Compte() {

	} 
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitulaire() {
		return titulaire;
	}

	public void setTitulaire(String titulaire) {
		this.titulaire = titulaire;
	}

	public Double getSolde() {
		return solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}

	public LocalDate getDateAcces() {
		return dateAcces;
	}

	public void setDateAcces(LocalDate dateAcces) {
		this.dateAcces = dateAcces;
	}


	public Boolean getFermer() {
		return fermer;
	}



	public void setFermer(Boolean fermer) {
		this.fermer = fermer;
	}

	

}
