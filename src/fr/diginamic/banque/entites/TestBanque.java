package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        // Création d'un tableau de comptes
        Compte[] comptes = new Compte[2];

        // Première instance, compte normal
        comptes[0] = new Compte("100023456789", 9999.0);

        // Deuxième instance, compte avec taux de rémunération
        comptes[1] = new CompteTaux("9876543200001", 4000.0, 0.05);

        // Affichage des informations des comptes
        for (Compte compte : comptes) {
            System.out.println(compte);
        }
    }
}
