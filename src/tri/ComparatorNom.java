package tri;

import listes.Ville;

import java.util.Comparator;

class ComparatorNom implements Comparator<Ville> {
    @Override
    public int compare(Ville ville1, Ville ville2) {
        return ville1.getNom().compareTo(ville2.getNom());
    }
}
