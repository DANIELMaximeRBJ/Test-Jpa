package fr.jpa.bank;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
@Table(name="Adresse")
public class Adresse {
	
	@Column(name = "Numero", nullable = false)
	private  int numero;
	@Column(name = "Rue", length = 50, nullable = false)
	private  String rue;
	@Column(name = "Code_Postal", nullable = false)
	private  int codepostal;
	@Column(name = "Ville", length = 30, nullable = false)
	private  String ville;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public int getCodepostal() {
		return codepostal;
	}

	public void setCodepostal(int codepostal) {
		this.codepostal = codepostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
}
