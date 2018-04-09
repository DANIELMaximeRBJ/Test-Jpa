package fr.jpa.bank;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
	
	@ManyToOne
	@JoinColumn(name="ID_CLIENT")
	private Banque banque; 
}
