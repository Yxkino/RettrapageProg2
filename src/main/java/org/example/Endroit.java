package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Endroit {
    private String id;
    private String nom;
    protected List<Appartement> appartements;

    public Endroit(String id, String nom) {
        this.id = id;
        this.nom = nom;
        this.appartements = new ArrayList<>();
    }

    public String getId() { return id; }
    public String getNom() { return nom; }
    public List<Appartement> getAppartements() { return appartements; }
    public abstract int compterAppartements();
}