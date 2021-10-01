package session2;

import java.util.ArrayList;

public class TestGenerics2 {

    public static void main(String[] args) {
        new TestGenerics2().los();
    }

    public void los() {
        ArrayList<Haustier> haustiere = new ArrayList<>();
        haustiere.add(new Hund());
        haustiere.add(new Katze());
        haustiere.add(new Hund());

        tiereAnnehmen(haustiere);

        /*
        Wenn eine Methode mit dem Argument ArrayList<Haustier> deklarieren, können Sie ihr NUR
        ein ArrayList<Haustier> übergeben, keine ArrayList<Hund> oder ArrayList<Katze>

        --> tiereAnnahmen(hunde); geht NICHt, da tiereAnnehmen NUR Haustiere annimmt.

         */
        ArrayList<Hund> hunde = new ArrayList<>();
        hunde.add(new Hund());
        hunde.add(new Hund());
        // tiereAnnahmen(hunde);
    }


    // public void tiereAnnehmen(ArrayList<? extends Haustier> haustiere) {
    public void tiereAnnehmen(ArrayList<Haustier> haustiere) {
        for (Haustier h: haustiere) {
            h.fressen();
        }
    }




    /*
    public static void main(String[] args) {
        new TestGenerics1().los();
    }

    public void los() {
        Haustier[] haustiere = {new Hund(), new Katze(), new Hund()};
        Hund[] hunde = {new Hund(), new Hund(), new Hund()};
        tiereAnnehmen(haustiere);
        tiereAnnehmen(hunde);
    }

    public void tiereAnnehmen(Haustier[] haustiere) {
        for (Haustier h: haustiere) {
            h.fressen();
        }
    }
     */
}
