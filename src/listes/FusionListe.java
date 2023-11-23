package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {
    public static void main(String args[]) {
        List<String> liste1 = new ArrayList<String>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");

        List<String> liste2 = new ArrayList<String>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        // Création de la liste3 et ajout des éléments de liste1
        List<String> liste3 = new ArrayList<>(liste1);

        // Ajout des éléments de liste2 à liste3
        for (String couleur : liste2) {
            liste3.add(couleur);
        }

        // Affichage de la liste3
        System.out.println("Liste 3 : " + liste3);
    }
}
