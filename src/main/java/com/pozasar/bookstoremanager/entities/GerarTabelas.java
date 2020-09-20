package com.pozasar.bookstoremanager.entities;

import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GerarTabelas {
	
    private EntityManager conexao;

	public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("meujpa");
        EntityManager em = factory.createEntityManager();
        
//        AuthorDb nomeAutor = new AuthorDb(null, "Allen Wood");
//        AuthorDb nomeAutor2 = new AuthorDb(null, "Michael Duque");
//        AuthorDb nomeAutor3 = new AuthorDb(null, "Victor Vieira");
//        AuthorDb nomeAutor4 = new AuthorDb(null, "Michael Duque");
//        AuthorDb nomeAutor5 = new AuthorDb(null, "Sam Sasser");
//        AuthorDb nomeAutor6 = new AuthorDb(null, "Judson Cornwall");
//        AuthorDb nomeAutor7 = new AuthorDb(null, "Benny Hinn");
//        AuthorDb nomeAutor8 = new AuthorDb(null, "J. K. Rowling");
//        AuthorDb nomeAutor9 = new AuthorDb(null, "Augusto Cury");
//        AuthorDb nomeAutor10 = new AuthorDb(null, "Dan Brown");
//        AuthorDb nomeAutor11 = new AuthorDb(null, "Fernando Pessoa");
//        AuthorDb nomeAutor12 = new AuthorDb(null, "Gustavo Cerbasi");
//        AuthorDb nomeAutor13 = new AuthorDb(null, "Geroge R. R. Martin");
//        AuthorDb nomeAutor14 = new AuthorDb(null, "Camões");
//        AuthorDb nomeAutor15 = new AuthorDb(null, "Ziraldo");
//        AuthorDb nomeAutor16 = new AuthorDb(null, "Michael Duque");
//        AuthorDb nomeAutor17 = new AuthorDb(null, "C. S Lewis"); 
//        AuthorDb nomeAutor18 = new AuthorDb(null, "Cecília Meireles");
//        AuthorDb nomeAutor19 = new AuthorDb(null, "Clarice Lispector");
//        AuthorDb nomeAutor20 = new AuthorDb(null,  "Cora Coralina");
        												
        em.getTransaction().begin();
//        em.persist(nomeAutor11);
//        em.persist(nomeAutor12);
//        em.persist(nomeAutor13);
//        em.persist(nomeAutor14);
//        em.persist(nomeAutor15);
//        em.persist(nomeAutor16);
//        em.persist(nomeAutor17);
//        em.persist(nomeAutor18);
//        em.persist(nomeAutor19);
//        em.persist(nomeAutor20);
        
        Long key = (long) 2;
        em.createQuery("select e from AuthorDb e where id <= :num").setParameter("num", key).getResultList();
        
        em.getTransaction().commit();
        System.out.println("Pronto");
        
        em.close();
        factory.close();
      }

}
