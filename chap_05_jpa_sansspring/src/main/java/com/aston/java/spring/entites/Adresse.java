package com.aston.java.spring.entites;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Adresse extends AbstractEntity{


	private String libelle;

	/*@OneToMany/*(mappedBy = "adresse")*/
	/*@JoinColumn(name="adresseId")
	private Set<Artiste> artistes;*/



	/*public Adresse(Integer id, String libelle) {
		this.id = id;
		this.libelle = libelle;
	}*/
	
	
	public Adresse(String libelle) {
		//this(null, libelle);
		this.libelle = libelle;
	}


	public Adresse() {
		//this(null);
	}



	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	/*public Set<Artiste> getArtistes() {
		return artistes;
	}

	public void setArtistes(Set<Artiste> artistes) {
		this.artistes = artistes;
	}*/

}
