package fr.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestJpa {
	private static final Logger LOG = LoggerFactory.getLogger(TestJpa.class);

	public static void main(String[] args) {
		/*
		 * EntityManagerFactory entityManagerFactory =
		 * Persistence.createEntityManagerFactory("pu_essai"); EntityManager em
		 * = entityManagerFactory.createEntityManager();
		 */

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager em = entityManagerFactory.createEntityManager();

		Livre livre1 = new Livre();
		/*
		 * livre1 = em.find(Livre.class, 4); if (livre1 != null){
		 * LOG.info("'"+livre1.getTitre() +"' "+ livre1.getAuteur());
		 * //traitement }
		 */

		TypedQuery<Emprunt> query = em.createQuery("SELECT a FROM Emprunt a WHERE a.id=:reference", Emprunt.class);
		query.setParameter("reference", 2);
		if (query != null) {
			List<Emprunt> emprunt = query.getResultList();
			for (Emprunt e : emprunt)
				LOG.info("\n" + e.toString());
		}

		TypedQuery<Client> query2 = em.createQuery("SELECT a FROM Client a WHERE a.id=:reference", Client.class);
		query2.setParameter("reference", 1);
		if (query2 != null) {
			List<Client> client = query2.getResultList();
			for (Client c : client)
				LOG.info("\n" + c.toString());
		}
	}
}
