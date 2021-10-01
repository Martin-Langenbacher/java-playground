package session2;

import java.util.TreeSet;

public class TestTree {

    public static void main(String[] args) {
        new TestTree().los();
    }

    public void los() {
        Buch b1 = new Buch("Katzen sind unvergleichlich");
        Buch b2 = new Buch("Sortieren Sie Ihren Körper neu");
        Buch b3 = new Buch("Findet Emo");

        TreeSet<Buch> tree = new TreeSet<Buch>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);

        System.out.println(tree);

    }
}
