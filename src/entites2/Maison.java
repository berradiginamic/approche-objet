package entites2;

import java.util.Arrays;

public class Maison {

    private Piece[] pieces;

    public Maison() {
        // Initialisation du tableau de pièces
        pieces = new Piece[0];
    }

    public void ajouterPiece(Piece nvPiece) {
        if (nvPiece == null) {
            // Ignorer les pièces nulles
            return;
        }

        // On crée un nouveau tableau avec une taille augmentée de 1
        Piece[] newTab = Arrays.copyOf(pieces, pieces.length + 1);

        // On place la nouvelle pièce en dernière position
        newTab[newTab.length - 1] = nvPiece;

        // On remplace l'ancien tableau par le nouveau
        this.pieces = newTab;
    }

    public int nbPieces() {
        return pieces.length;
    }

    public double superficieEtage(int choixEtage) {
        double superficieEtage = 0;

        for (int i = 0; i < pieces.length; i++) {
            if (choixEtage == this.pieces[i].getNumEtage()) {
                superficieEtage = this.pieces[i].getSuperficie();
            }
        }

        return superficieEtage;
    }

    public double superficieTypePiece(String typePiece) {
        double superficie = 0;

        for (int i = 0; i < pieces.length; i++) {
            if (typePiece != null && typePiece.equals(this.pieces[i].getType())) {
                superficie += this.pieces[i].getSuperficie();
            }
        }

        return superficie;
    }

    public double calculerSurface() {
        double superficieTot = 0;

        for (int i = 0; i < pieces.length; i++) {
            superficieTot += this.pieces[i].getSuperficie();
        }

        return superficieTot;
    }

    public Piece[] getPieces() {
        return pieces;
    }
}