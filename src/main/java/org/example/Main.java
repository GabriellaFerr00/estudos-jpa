package org.example;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
            //objetos já salvos no banco de dados
//        Pessoa p1 = new Pessoa(null, "Gabriella Ferreira", "gabriella@gmail.com");
//        Pessoa p2 = new Pessoa(null, "Amanda Ferreira", "amanda@gmail.com");
//        Pessoa p3 = new Pessoa(null, "Jordania Ferreira", "jordania@gmail.com");

        //pega o nome do arquivo persistence.xml
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        //conexao com o banco de dados e todos os contexto de persistencia implementada
        EntityManager em = emf.createEntityManager();

        //entendendo o que é uma entidade monitorada
        //só ira conseguir deletar alguma entidade se ela ja estiver sido inserida ou buscada no banco
        Pessoa p = em.find(Pessoa.class, 3);
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();

        System.out.println(p);
        System.out.println("Feito!");

        em.clear();
        emf.close();


    }
}