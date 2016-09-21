package br.com.teste.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Connection {
	
	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("App");
	
	public static EntityManager getConnection(){
		return factory.createEntityManager();
	}

}
