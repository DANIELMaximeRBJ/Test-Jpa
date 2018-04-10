package fr.jpa.bank;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Virement")
public class Virement extends Operation{
	@Column(name = "BENIFICIAIRE", nullable = false, length = 50)
	private  String benificiaire;
	
	@ManyToOne
	@JoinColumn(name="ID_COMPTE")
	private Compte compte2; 
	

	public String getBenificiaire() {
		return benificiaire;
	}

	public void setBenificiaire(String benificiaire) {
		this.benificiaire = benificiaire;
	}

	@Override
	public String toString() {
		return "Virement [benificiaire=" + benificiaire + "]";
	}

	public Compte getCompte() {
		return compte2;
	}

	public void setCompte(Compte compte2) {
		this.compte2 = compte2;
	}




	
	
}
