package com.aston.java.spring.entites;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Album extends AbstractEntity{

	private String titre;

	@ManyToMany(mappedBy = "albums")
	private List<Artiste> artistes;


	/*public Album(String titre) {
		this.titre = titre;
	}


	public Album(Integer id, String titre) {
		super();
		this.id = id;
		this.titre = titre;
		artistes = new ArrayList<Artiste>();
	}*/


	public Album() {

		//this(null);
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}



}
