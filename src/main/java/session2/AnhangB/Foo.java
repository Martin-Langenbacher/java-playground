package session2.AnhangB;

public class Foo {

    public static void main(String[] args) {
        new Foo().los();
    }

    // NOTE: main() muss die Instanz nur erzeugen, damit wir main() eine der Methoden der Instanz aufrufen kann.
    void los() {
        // hier steckt das, was wir EIGENTLICH suchen ...
        System.out.println("... hier steckt das, was wir EIGENTLICH suchen...");
    }
}
