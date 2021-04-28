package com.aston.java.spring.entites;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.aston.java.spring.utils.JpaUtils;

@Entity
//@Table(name = "t_artiste")
public class Artiste extends AbstractEntity {


	@Column(nullable = false, length = 25)
	private String prenom; 
	@Column(nullable = false, length = 20)
	private String nom; 
	@Column(unique = true, nullable = false)
	private String email; 
	
	@Column(length = 2000)
	private String bio;

	private LocalDate ddn; 
	@Transient
	private int age;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	//@JoinColumn(name="adresseId")
	private Adresse adresse;

	@ManyToMany
	private List<Album> albums;


/*public Artiste( String prenom, String nom, String email, String bio, LocalDate ddn) {

		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.bio = bio;
		this.ddn = ddn;
		//albums = new ArrayList<Album>();
		//adresse = new Adresse();
	}*/

	public Artiste(String prenom, String nom, String email, LocalDate ddn) {
		//this( prenom, nom, email, "", ddn);
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.ddn = ddn;
	}
	
	
	public Artiste() {

		//this(null, null, null, null);
	}



	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public LocalDate getDdn() {
		return ddn;
	}

	public void setDdn(LocalDate ddn) {
		this.ddn = ddn;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Album> getAlbums() {
		return albums;
	}

	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	@PrePersist
	//@PreUpdate
	protected void avantPersistMerge() {
		prenom = JpaUtils.capitalise(prenom);
		email = email.trim().toLowerCase();
		nom = nom.trim().toUpperCase();
	}
	
	@PostPersist
	protected void apresChargement() {
		
		age = JpaUtils.calculeAge(ddn);
		
	}


}
