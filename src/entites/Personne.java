package entites;

public class Personne {
    // Attributs
    public String nom;
    public String prenom;
    public AdressePostale adresse;

    // Constructeur avec les paramètres nom et prenom
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    // Second constructeur avec les paramètres nom, prenom et adresse
    public Personne(String nom, String prenom, AdressePostale adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }
    public void afficherNomPrenomMajuscules() {
        System.out.println("Nom: " + nom.toUpperCase() + ", Prénom: " + prenom.toUpperCase());
    }

    // Méthode pour modifier le nom
    public void modifierNom(String nouveauNom) {
        this.nom = nouveauNom;
    }

    // Méthode pour modifier le prénom
    public void modifierPrenom(String nouveauPrenom) {
        this.prenom = nouveauPrenom;
    }

    // Méthode pour modifier l'adresse
    public void modifierAdresse(AdressePostale nouvelleAdresse) {
        this.adresse = nouvelleAdresse;
    }

    // Méthode pour retourner le nom
    public String getNom() {
        return nom;
    }

    // Méthode pour retourner le prénom
    public String getPrenom() {
        return prenom;
    }

    // Méthode pour retourner l'adresse
    public AdressePostale getAdresse() {
        return adresse;
    }

}
