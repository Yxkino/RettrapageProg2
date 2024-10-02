package org.example;

public class Main {
    public static void main(String[] args) {
        Appartement a1 = new Appartement("A1", "Studio", "Studio à Ivandry", 500, "libre");
        Appartement a2 = new Appartement("A2", "T2", "Appartement T2 à Analamahitsy", 700, "occupé");
        Appartement a3 = new Appartement("A3", "T3", "Appartement T3 à Ivandry", 1000, "libre");

        Immeuble immeubleJade = new Immeuble("I1", "Immeuble Jade", 5);
        immeubleJade.getAppartements().add(a1);
        immeubleJade.getAppartements().add(a3);

        Quartier ivandry = new Quartier("Q1", "Ivandry");
        ivandry.getAppartements().add(a2);
        ivandry.ajouterImmeuble(immeubleJade);

        System.out.println("Appartements dans Ivandry : " + ivandry.compterAppartements());
        System.out.println("A1 dans Ivandry ? " + ivandry.appartementDansQuartier(a1));
        System.out.println("A2 dans Ivandry ? " + ivandry.appartementDansQuartier(a2));
    }
}