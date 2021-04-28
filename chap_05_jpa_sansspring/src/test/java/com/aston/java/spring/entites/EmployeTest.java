package com.aston.java.spring.entites;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class EmployeTest {

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
	static void detroy() {
		if (em != null) {
			em.close();
		}

		if (emf != null) {
			em.close();
		}
	}

	@Test
	void testPersistEmploye() {
		Employe joachimSenior = new Employe("Joachim Senior", "joa.s@zad.org", LocalDate.of(1899, 5, 18));
		//joachimSenior.setAdresse(1);
		

	}

}
