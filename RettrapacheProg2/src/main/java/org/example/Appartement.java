package org.example;

public class Appartement {
    private String id;
    private String nom;
    private String details;
    private double loyer;
    private String statut;

    public Appartement(String id, String nom, String details, double loyer, String statut) {
        this.id = id;
        this.nom = nom;
        this.details = details;
        this.loyer = loyer;
        this.statut = statut;
    }

    public String getId() { return id; }
    public String getNom() { return nom; }
    public String getDetails() { return details; }
    public double getLoyer() { return loyer; }
    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }
}
