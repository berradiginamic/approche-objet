package listes;

import java.util.ArrayList;

public class TestVilles {
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

        // Recherche de la ville la plus peuplée
        Ville villePlusPeuplee = trouverVillePlusPeuplee(villes);
        System.out.println("Ville la plus peuplée : " + villePlusPeuplee.getNom());

        // Suppression de la ville la moins peuplée
        Ville villeMoinsPeuplee = trouverVilleMoinsPeuplee(villes);
        villes.remove(villeMoinsPeuplee);

        // Modification des villes de plus de 100 000 habitants
        for (Ville ville : villes) {
            if (ville.getNbHabitants() > 100000) {
                ville = new Ville(ville.getNom().toUpperCase(), ville.getNbHabitants());
            }
        }

        // Affichage de la liste résultante
        System.out.println("Liste résultante : ");
        for (Ville ville : villes) {
            System.out.println(ville);
        }
    }

    // Méthode pour trouver la ville la plus peuplée
    private static Ville trouverVillePlusPeuplee(ArrayList<Ville> villes) {
        Ville villePlusPeuplee = null;
        int maxHabitants = 0;

        for (Ville ville : villes) {
            if (ville.getNbHabitants() > maxHabitants) {
                maxHabitants = ville.getNbHabitants();
                villePlusPeuplee = ville;
            }
        }

        return villePlusPeuplee;
    }

    // Méthode pour trouver la ville la moins peuplée
    private static Ville trouverVilleMoinsPeuplee(ArrayList<Ville> villes) {
        Ville villeMoinsPeuplee = null;
        int minHabitants = Integer.MAX_VALUE;

        for (Ville ville : villes) {
            if (ville.getNbHabitants() < minHabitants) {
                minHabitants = ville.getNbHabitants();
                villeMoinsPeuplee = ville;
            }
        }

        return villeMoinsPeuplee;
    }
}
