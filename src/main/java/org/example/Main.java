package org.example;

import dominio.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(1, "Gabriella Ferreira", "gabriella@gmail.com");
        Pessoa p2 = new Pessoa(1, "Amanda Ferreira", "amanda@gmail.com");
        Pessoa p3 = new Pessoa(1, "Jordania Ferreira", "jordania@gmail.com");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}