package tri;

import listes.Ville;

import java.util.Comparator;

class ComparatorHabitant implements Comparator<Ville> {
    @Override
    public int compare(Ville ville1, Ville ville2) {
        return Integer.compare(ville1.getNbHabitants(), ville2.getNbHabitants());
    }
}
