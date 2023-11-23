package tri;

import listes.Ville;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparator {
    public static void main(String[] args) {
        // Création de la liste de villes
        ArrayList<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));

        // Tri avec le ComparatorHabitant
        Collections.sort(villes, new ComparatorHabitant());
        System.out.println("Tri par nombre d'habitants : ");
        afficherListeVilles(villes);

        // Tri avec le ComparatorNom
        Collections.sort(villes, new ComparatorNom());
        System.out.println("\nTri par nom : ");
        afficherListeVilles(villes);
    }

    // Méthode pour afficher la liste de villes
    private static void afficherListeVilles(ArrayList<Ville> villes) {
        for (Ville ville : villes) {
            System.out.println(ville);
        }
    }
}