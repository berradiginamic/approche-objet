package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {
    public static void main(String[] args) {
        // Création d'un tableau d'opérations
        Operation[] operations = new Operation[]{
                new Credit("2023-11-01", 500.0),
                new Debit("2023-11-03", 200.0),
                new Credit("2023-11-04", 300.0),
                new Debit("2023-11-15", 100.0)
        };

        // Affichage des informations des opérations
        for (Operation operation : operations) {
            System.out.println("Date: " + operation.getDate());
            System.out.println("Montant: " + operation.getMontant());
            System.out.println("Type: " + operation.getType());
            System.out.println();
        }

        // Calcul du montant global des opérations
        double montantGlobal = 0.0;
        for (Operation operation : operations) {
            if (operation instanceof Credit) {
                montantGlobal += operation.getMontant();
            } else if (operation instanceof Debit) {
                montantGlobal -= operation.getMontant();
            }
        }

        System.out.println("Montant global des opérations : " + montantGlobal);
    }

}
