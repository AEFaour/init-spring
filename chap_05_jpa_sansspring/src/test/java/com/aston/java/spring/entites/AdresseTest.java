package com.aston.java.spring.entites;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class AdresseTest {
	
	private static EntityManagerFactory emf;
	private static EntityManager em;
	private static EntityTransaction tx;

	@BeforeAll
	static void init() {
		emf = Persistence.createEntityManagerFactory("MYSQL_ASTON_PU");
		em = emf.createEntityManager();
		tx = em.getTransaction();
	}

	@AfterAll
	static void detroy(){
		if (em != null) {
            em.close();
        }
        if (emf != null) {
            em.close();
        }
	}

	/*
	@Test
	void testPersistAdresse() {
		Adresse oneAdresse = new Adresse("27, Rue Monge", "75005", "Paris");
		Adresse twoAdresse = new Adresse("44, Avenue Victor Hugo", "75016", "Paris");
		assertNull(oneAdresse.getId(), "L'id est null");
		assertNull(twoAdresse.getId(), "L'id est null");

		tx.begin();
		em.persist(oneAdresse);
		em.persist(twoAdresse);
		tx.commit();
		
		assertEquals(oneAdresse.getId(), 2);
		assertEquals(twoAdresse.getId(), 3);
	}

	@Test
	void testFindMergeAdresse(){
		Adresse adresse = em.find(Adresse.class, 2);
		assertEquals(adresse.getCodePostal(), "75005");

		adresse.setNomVoie("2, Place Charas");
		adresse.setCodePostal("92400");
		adresse.setCity("Courbevoie");
		tx.begin();
		em.merge(adresse);
		tx.commit();

		assertEquals(adresse.getCodePostal(), "92400");

	}

	@Test
	void testRemoveAdresse(){
		Adresse adresse = em.find(Adresse.class, 5);
		assertEquals(adresse.getCodePostal(), "75005");

		tx.begin();
		em.remove(adresse);
		tx.commit();

		adresse = em.find(Adresse.class, 5);
		assertNull(adresse);
	}

	@Test
	void testFindAllAdresses(){
		Query requete = em.createQuery("select a from Adresse a");
		assertEquals(requete.getResultList().size(), 4);
	}

	@Test
	void testFindAdresseByCity(){
		Query requete = em.createQuery("select a from Adresse a where a.city = :city", Adresse.class);
		requete.setParameter("city", "Courbevoie");
		assertNotNull(requete.getSingleResult());
		assertEquals(((Adresse)requete.getSingleResult()).getId(), 2);
	}
*/


}
