package session2;

import java.util.ArrayList;
import java.util.TreeSet;

public class TestTreeBuch2 {

    public static void main(String[] args) {
        new TestTreeBuch2().los();
    }

    public void los() {
        Buch2 b1 = new Buch2("Katzen sind unvergleichlich");
        Buch2 b2 = new Buch2("Sortieren Sie Ihren Körper neu");
        Buch2 b3 = new Buch2("Findet Emo");
        Buch2 b4 = new Buch2("AAA: Das Buch auf Platz 4?");

        ArrayList<Buch2> buchListe = new ArrayList<>();

        buchListe.add(b1);
        buchListe.add(b2);
        buchListe.add(b3);
        buchListe.add(b4);
        System.out.println(buchListe);

        // zum vergleichen...
        BuchVergleich2 buchVergleich2 = new BuchVergleich2();
        TreeSet<Buch2> tree = new TreeSet<>(buchVergleich2);


        //TreeSet<Buch2> tree = new TreeSet<Buch2>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        tree.add(b4);
        System.out.println(tree);
    }


}
