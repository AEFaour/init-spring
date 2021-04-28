package com.aston.java.spring.entites;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
public class Employe{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable = false, length = 45)
	private String prenom;
	@Column(unique = true, nullable = false)
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="adresseId")
	private Adresse adresse;
	private LocalDate ddn;

	public Employe(String prenom, String email, Adresse adresse, LocalDate ddn) {

		this.prenom = prenom;
		this.adresse = adresse;
		this.ddn = ddn;
	}


	public Employe(String prenom, String email, LocalDate ddn) {
		this.prenom = prenom;
		this.email = email;
		this.ddn = ddn;
	}

	public Employe() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public LocalDate getDdn() {
		return ddn;
	}

	public void setDdn(LocalDate ddn) {
		this.ddn = ddn;
	}


}
