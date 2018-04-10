package fr.jpa;



import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import fr.jpa.bank.Client;
import fr.jpa.bank.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestJpa {
	private static final Logger LOG = LoggerFactory.getLogger(TestJpa.class);

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("banque");
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		Set<Compte> comptes = new HashSet<>() ;
		Set<Compte> comptes2 = new HashSet<>();
		Set<Virement> virement = new HashSet<>();
		
		Adresse adresse = new Adresse();
		adresse.setNumero(11);
		adresse.setRue("rue du progrès");
		adresse.setVille("les sorinières");
		adresse.setCodepostal(44840);
		
		
		
		Banque banque = new Banque();
		banque.setId(0);
		banque.setNom("écureuille");				
		
		LivretA livretA = new LivretA();		
		livretA.setTaux(0.05);
		livretA.setId(0);
		livretA.setSolde(10000);
		livretA.setCodeCompte("test0001");
		comptes.add(livretA);
		
		AssuranceVie assuranceVie = new AssuranceVie();		
		assuranceVie.setTaux(0.05);
		assuranceVie.setId(1);
		assuranceVie.setDatefin(LocalDate.of(2200, 6, 29));
		assuranceVie.setSolde(1840.25);
		assuranceVie.setCodeCompte("test0002");
		comptes2.add(assuranceVie);
		
		
		Virement virement2 = new Virement();
		virement2.setMontant(159.00);
		virement2.setBenificiaire("Dieu");
		virement2.setMotif("religion");
		virement2.setCompte(livretA);
		virement2.setId(0);
		virement2.setDate(LocalDateTime.of(2017, 12, 31, 23, 59));
		
		virement.add(virement2);
		livretA.setVirement(virement);

		Client client = new Client();
		client.setId(0);
		client.setPrenom("Maxime");
		client.setNom("Daniel");
		client.setAdresse(adresse);
		client.setBanque(banque);
		client.setDateNaissance(LocalDate.of(1995, 6, 29));
		client.setCompte(comptes);
		client.setCompte(comptes2);
		
		
		Client client2 = new Client();
		client2.setId(1);
		client2.setPrenom("Jean");
		client2.setNom("Jean");
		client2.setAdresse(adresse);
		client2.setBanque(banque);
		client2.setDateNaissance(LocalDate.of(2001, 1, 1));
		client2.setCompte(comptes);
		
		//em.persist(adresse);
		em.persist(banque);
		em.persist(client);
		em.persist(client2);
		em.persist(livretA);
		em.persist(virement2);
		em.persist(assuranceVie);
		
		et.commit();
		em.close();
	}
}
