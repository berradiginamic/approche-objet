package entites;

public class TestPersonne {
    public static void main(String[] args) {
        // Utilisation du constructeur avec arguments de la classe Personne
        AdressePostale adresse1 = new AdressePostale(3, "Place Watteau", "30900", "Nîmes");
        Personne personne1 = new Personne("Berrabah", "Fatima", adresse1);

        // Utilisation de la méthode pour modifier l'adresse
        AdressePostale nouvelleAdresse = new AdressePostale(5, "Impasse Vivaldi", "30900", "Nîmes");
        personne1.modifierAdresse(nouvelleAdresse);

        // Utilisation de la méthode pour afficher le nom et le prénom en majuscules
        personne1.afficherNomPrenomMajuscules();

        // Utilisation des méthodes pour récupérer le nom, le prénom et l'adresse
        System.out.println("Nom: " + personne1.getNom());
        System.out.println("Prénom: " + personne1.getPrenom());
        System.out.println("Adresse: " + personne1.getAdresse().numeroRue + " " + personne1.getAdresse().libelleRue +
                ", " + personne1.getAdresse().codePostal + " " + personne1.getAdresse().ville);
    }
}
