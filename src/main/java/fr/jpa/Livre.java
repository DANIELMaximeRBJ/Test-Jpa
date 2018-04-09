package fr.jpa;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="Livre")
public class Livre {
	
	@Id
	private Integer id;
	@Column(name = "Titre", length = 30, nullable = false, unique = true)
	private  String titre;
	@Column(name = "Auteur", length = 30, nullable = false)
	private  String auteur;

	@ManyToMany
	@JoinTable(name="compo",
	joinColumns= @JoinColumn(name="ID_LIV", referencedColumnName=
	"ID"),
	inverseJoinColumns= @JoinColumn(name="ID_EMP", referencedColumnName="ID")
	)
	private Set<Emprunt> emprunt;
	
	public Livre(){
		emprunt = new HashSet<>();
	}
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getAuteur() {
		return auteur;
	}


	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String toString(){
		return "Titre: "+ getTitre() + " Auteur: "+ getAuteur(); 
	}

	
}
