package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernateUtil {
    private static EntityManagerFactory entityManagerFactory;
    public static EntityManager getEntityManagerFactory(){
        if(entityManagerFactory == null) {
            entityManagerFactory = Persistence.createEntityManagerFactory("application-unit");
        }
        return entityManagerFactory.createEntityManager();
    }
}
