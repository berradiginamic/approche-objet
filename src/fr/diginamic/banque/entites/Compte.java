package fr.diginamic.banque.entites;

public class Compte {

    // Attributs d'instance (encapsulation)
    private String numeroCompte;
    private double solde;

    // Constructeur avec numéro de compte et solde
    public Compte(String numeroCompte, double solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    // Getters et setters (encapsulation)
    public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    // Redéfinition de la méthode toString()
    @Override
    public String toString() {
        return "Compte [Numero de compte=" + numeroCompte + ", Solde=" + solde + "]";
    }
}