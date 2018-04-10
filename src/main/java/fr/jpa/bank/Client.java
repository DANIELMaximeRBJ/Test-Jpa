package fr.jpa.bank;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="Client")
public class Client {

	@Id
	private Integer id;
	@Column(name = "Nom", length = 30, nullable = false)
	private  String nom;
	@Column(name = "Prenom", length = 30, nullable = false)
	private  String prenom;
	@Column(name = "datedenaissance", length = 30, nullable = false)
	private  LocalDate dateNaissance;
	
	
	@ManyToMany
	@JoinTable(name="compo",
	joinColumns= @JoinColumn(name="ID_CLI", referencedColumnName=
	"ID"),
	inverseJoinColumns= @JoinColumn(name="ID_COM", referencedColumnName="ID")
	)
	private Set<Compte> compte;
	
	@ManyToOne
	@JoinColumn(name="ID_CLIENT")
	private Banque banque;
	
	@Embedded
	private Adresse adresse;
	

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

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Banque getBanque() {
		return banque;
	}

	public void setBanque(Banque banque) {
		this.banque = banque;
	}

	public Set<Compte> getCompte() {
		return compte;
	}

	public void setCompte(Set<Compte> compte) {
		this.compte = compte;
	}



	
	
	
	
	
}

