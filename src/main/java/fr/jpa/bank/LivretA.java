package fr.jpa.bank;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="LivretA")
public class LivretA extends Compte{

	@Column(name = "Taux", nullable = false)
	private  double taux;
	

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	@Override
	public String toString() {
		return "LivretA [taux=" + taux + "]";
	}
	
	
	
	
}
