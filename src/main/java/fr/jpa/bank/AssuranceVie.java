package fr.jpa.bank;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="AssuranceVie")
public class AssuranceVie extends Compte{
	
	@Column(name = "Taux", nullable = false)
	private  double taux;
	@Column(name = "DATE_FIN", nullable = false)
	private  LocalDate datefin;
	
	public double getTaux() {
		return taux;
	}
	public void setTaux(double taux) {
		this.taux = taux;
	}
	public LocalDate getDatefin() {
		return datefin;
	}
	public void setDatefin(LocalDate datefin) {
		this.datefin = datefin;
	}
	@Override
	public String toString() {
		return "AssuranceVie [taux=" + taux + ", datefin=" + datefin + "]";
	}
	
	


}
