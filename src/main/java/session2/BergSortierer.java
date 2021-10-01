package session2;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class BergSortierer {

    LinkedList<Berg> berge = new LinkedList<Berg>();
    class Namensvergleich implements Comparator <Berg> {
        public int compare(Berg eins, Berg zwei) {
            return eins.name.compareTo(zwei.name);
        }
    }
    class Höhenvergleich implements Comparator <Berg> {
        public int compare(Berg eins, Berg zwei) {
            return (zwei.höhe - eins.höhe);
        }
    }

    public static void main(String[] args) {
        new BergSortierer().los();
    }

    public void los() {
        berge.add(new Berg("Matterhorn", 4478));
        berge.add(new Berg("Dom", 4545));
        berge.add(new Berg("Nordend", 4609));
        berge.add(new Berg("Nadelhorn", 4327));

        System.out.println("Wie eingegeben:\n" + berge);
        Namensvergleich nc = new Namensvergleich();
        Collections.sort(berge, nc);

        System.out.println("Nach Namen:\n" + berge);
        Höhenvergleich hc = new Höhenvergleich();
        Collections.sort(berge, hc);
        System.out.println("Nach Höhe:\n" + berge);

    }
}
