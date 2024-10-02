package org.example;

import java.util.List;
import java.util.ArrayList;

public class Quartier extends Endroit {
    private List<Immeuble> immeubles;

    public Quartier(String id, String nom) {
        super(id, nom);
        this.immeubles = new ArrayList<>();
    }

    public void ajouterImmeuble(Immeuble immeuble) {
        immeubles.add(immeuble);
    }

    @Override
    public int compterAppartements() {
        int total = appartements.size();
        for (Immeuble immeuble : immeubles) {
            total += immeuble.compterAppartements();
        }
        return total;
    }

    public boolean appartementDansQuartier(Appartement appartement) {
        return appartements.contains(appartement) || immeubles.stream().anyMatch(i -> i.getAppartements().contains(appartement));
    }
}