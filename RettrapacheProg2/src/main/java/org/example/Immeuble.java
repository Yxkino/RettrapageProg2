package org.example;

public class Immeuble extends Endroit {
    private int etages;

    public Immeuble(String id, String nom, int etages) {
        super(id, nom);
        this.etages = etages;
    }

    public int getEtages() { return etages; }

    @Override
    public int compterAppartements() {
        return appartements.size();
    }
}