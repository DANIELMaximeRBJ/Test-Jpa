package fr.jpa;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("banque");
		EntityManager em = entityManagerFactory.createEntityManager();

		//Livre livre1 = new Livre();
		/*
		 * livre1 = em.find(Livre.class, 4); if (livre1 != null){
		 * LOG.info("'"+livre1.getTitre() +"' "+ livre1.getAuteur());
		 * //traitement }
		 */

		/*TypedQuery<LivretA> query = em.createQuery("SELECT a FROM LivretA a WHERE a.id=:reference", LivretA.class);
		query.setParameter("reference", 0);
		if (query != null) {
			List<LivretA> compte = query.getResultList();
			for (LivretA e : compte)
				LOG.info("\n" + e.toString());
		}*/
	}
}
