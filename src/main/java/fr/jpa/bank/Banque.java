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
	@Column(name = "Nom", length = 30, nullable = false, unique = true)
	private  String nom;

	@OneToMany(mappedBy="banque")
	private Set<Client> client;
}
