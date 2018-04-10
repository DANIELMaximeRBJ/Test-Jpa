package fr.jpa.bank;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="Compte")
public class Compte {
	@Id
	private Integer id;
	@Column(name = "Code_Compte", nullable = false, length = 20)
	private  String codeCompte;
	@Column(name = "Solde", nullable = false)
	private  double solde;
	
	@OneToMany(mappedBy="compte2")
	private Set<Virement> virement;
	
	@ManyToMany(mappedBy="compte")
	private Set<Client> client;

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCodeCompte() {
		return codeCompte;
	}
	public void setCodeCompte(String codeCompte) {
		this.codeCompte = codeCompte;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	@Override
	public String toString() {
		return "Compte [id=" + id + ", codeCompte=" + codeCompte + ", solde=" + solde + "]";
	}

	
	
	
}
