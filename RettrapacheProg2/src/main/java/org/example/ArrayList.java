package org.example;

import java.util.List;

public class ArrayList {
    private List<Appartement> appartements;
    public ArrayList() {
        appartements = new ArrayList<>();
    }
    public void ajouterAppartement(Appartement appartement) {
        appartements.add(appartement);
    }
    public boolean estDansQuartier(Quartier quartier, Appartement appartement) {
        return quartier.getAppartements().contains(appartement);
    }
    public int compterAppartements(Endroit endroit) {
        return endroit.getAppartements().size();
    }
}
