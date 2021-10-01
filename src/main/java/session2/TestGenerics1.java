package session2;

public class TestGenerics1 {

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


}
