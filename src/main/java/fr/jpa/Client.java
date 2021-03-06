package fr.jpa;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Client")
public class Client {

	@Id
	private Integer id;
	@Column(name = "NOM", length = 30, nullable = false)
	private  String nom;
	@Column(name = "PRENOM", length = 30, nullable = false)
	private  String prenom;
	
	

	@OneToMany(mappedBy="client")
	private Set<Emprunt> emprunt;
	
	public Client(){
		emprunt = new HashSet<>();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String toString(){
		return "Nom: "+ getNom() + " prenom: "+ getPrenom() + emprunt.toString(); 
	}
}
