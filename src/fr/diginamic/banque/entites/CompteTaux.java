package fr.diginamic.banque.entites;

public class CompteTaux extends Compte{
    private double tauxRemuneration;

    // Constructeur avec 3 attributs
    public CompteTaux(String numeroCompte, double solde, double tauxRemuneration) {
        super(numeroCompte, solde);
        this.tauxRemuneration = tauxRemuneration;
    }

    // Redéfinition de la méthode toString()
    @Override
    public String toString() {
        return super.toString() + ", Taux de rémunération=" + tauxRemuneration;
    }
}
