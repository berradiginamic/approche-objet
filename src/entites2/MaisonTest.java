package entites2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaisonTest {

    @Test
    public void testAjouterPiece() {
        Maison maison = new Maison();

        // Création de quelques pièces
        Piece chambre = new Chambre(1, 20.0);
        Piece cuisine = new Cuisine(1, 15.0);

        // Ajout des pièces à la maison
        maison.ajouterPiece(chambre);
        maison.ajouterPiece(cuisine);

        // Vérification du nombre de pièces
        assertEquals(2, maison.nbPieces());

        // Vérification du type de la première pièce ajoutée
        assertEquals(Chambre.TYPE_CHAMBRE, maison.getPieces()[0].getType());

        // Vérification du type de la deuxième pièce ajoutée
        assertEquals(Cuisine.TYPE_CUISINE, maison.getPieces()[1].getType());
    }

    @Test
    public void testSuperficieEtage() {
        Maison maison = new Maison();

        // Création de quelques pièces
        Piece chambre1 = new Chambre(1, 20.0);
        Piece chambre2 = new Chambre(2, 25.0);

        // Ajout des pièces à la maison
        maison.ajouterPiece(chambre1);
        maison.ajouterPiece(chambre2);

        // Vérification de la superficie de l'étage 2
        assertEquals(25.0, maison.superficieEtage(2));
    }

    @Test
    public void testSuperficieTypePiece() {
        Maison maison = new Maison();

        // Création de quelques pièces
        Piece chambre = new Chambre(1, 20.0);
        Piece salon = new Salon(1, 30.0);

        // Ajout des pièces à la maison
        maison.ajouterPiece(chambre);
        maison.ajouterPiece(salon);

        // Vérification de la superficie totale des chambres
        double expectedSuperficie = 20.0;
        assertEquals(expectedSuperficie, maison.superficieTypePiece(Chambre.TYPE_CHAMBRE), 0.001);
    }

    @Test
    public void testCalculerSurface() {
        Maison maison = new Maison();

        // Création de quelques pièces
        Piece chambre = new Chambre(1, 20.0);
        Piece cuisine = new Cuisine(1, 15.0);

        // Ajout des pièces à la maison
        maison.ajouterPiece(chambre);
        maison.ajouterPiece(cuisine);

        // Vérification de la superficie totale de la maison
        assertEquals(35.0, maison.calculerSurface());
    }

    @Test
    public void testRobustesse() {
        Maison maison = new Maison();

        // Ajout d'une pièce null (devrait être ignorée)
        maison.ajouterPiece(null);

        // Vérification du nombre de pièces (devrait être 0)
        assertEquals(0, maison.nbPieces());
    }
}