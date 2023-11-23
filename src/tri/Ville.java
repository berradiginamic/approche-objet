import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Classe Ville
class Ville {
    private String nom;
    private int nbHabitants;

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    public String getNom() {
        return nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", nbHabitants=" + nbHabitants +
                '}';
    }
}

// Classe ComparatorHabitant
class ComparatorHabitant implements Comparator<Ville> {
    @Override
    public int compare(Ville ville1, Ville ville2) {
        return Integer.compare(ville1.getNbHabitants(), ville2.getNbHabitants());
    }
}

// Classe ComparatorNom
class ComparatorNom implements Comparator<Ville> {
    @Override
    public int compare(Ville ville1, Ville ville2) {
        return ville1.getNom().compareTo(ville2.getNom());
    }
}