package fr.diginamic.banque.entites;

public abstract class Operation {
    // Attributs
    private String date;
    private double montant;

    // Constructeur
    public Operation(String date, double montant) {
        this.date = date;
        this.montant = montant;
    }

    // Méthode abstraite getType()
    public abstract String getType();

    // Getters
    public String getDate() {
        return date;
    }

    public double getMontant() {
        return montant;
    }
}