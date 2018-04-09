package fr.jpa;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Emprunt")
public class Emprunt {

	@Id
	private Integer id;
	@Column(name = "DATE_DEBUT", length = 30, nullable = false)
	private  LocalDateTime Time_debut;
	@Column(name = "DATE_FIN", length = 30, nullable = false)
	private  LocalDateTime Time_fin;
	@Column(name = "DELAI")
	private  Integer delai;
	
	@ManyToOne
	@JoinColumn(name="ID_CLIENT")
	private Client client; 
	
	@ManyToMany(mappedBy="emprunt")
	private Set<Livre> livre;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getTime_debut() {
		return Time_debut;
	}
	public void setTime_debut(LocalDateTime time_debut) {
		Time_debut = time_debut;
	}
	public LocalDateTime getTime_fin() {
		return Time_fin;
	}
	public void setTime_fin(LocalDateTime time_fin) {
		Time_fin = time_fin;
	}
	public Integer getDelai() {
		return delai;
	}
	public void setDelai(Integer delai) {
		this.delai = delai;
	}	
	
	public String toString(){
		return "\n emprunt numéro : " + getId() + " contient les livres "+ livre.toString(); 
	}
}
