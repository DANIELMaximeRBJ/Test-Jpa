package fr.jpa.bank;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Banque")
public class Banque {
	@Id
	private Integer id;
	@Column(name = "Nom", length = 30, nullable = false)
	private  String nom;

	@OneToMany(mappedBy="banque")
	private Set<Client> client;

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

	public Set<Client> getClient() {
		return client;
	}

	public void setClient(Set<Client> client) {
		this.client = client;
	}
	
}
