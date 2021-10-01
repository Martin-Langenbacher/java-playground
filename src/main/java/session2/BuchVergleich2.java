package session2;

import java.util.Comparator;

public class BuchVergleich2 implements Comparator<Buch2> {
    public int compare(Buch2 eins, Buch2 zwei) {
        return (eins.titel.compareTo(zwei.titel));
    }
}
