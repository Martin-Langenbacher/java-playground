public class TierTestlauf {

    public static void main(String[] args) {

        Ente ente = new Ente("Dagobert");
        ente.bewegen();

        Hund hund = new Hund("Hund", 33);
        hund.bewegen();
        hund.bellen();

        Hund hund2 = new Hund("Hund2", 133);
        hund2.bewegen();
        hund2.bellen();

        Hund hund3 = new Hund("Hund3", 7);
        hund3.bewegen();
        hund3.bellen();

        String geheimnisString = ente.gibGeheinis();
        System.out.println(ente.getName() + ": " +geheimnisString);

        Hund hund4 = new Hund("Hund4");
        int hundeGroesseStart = 3;
        System.out.println();
        System.out.println("Die Eingabe der Hundegröße beträgt: " + hundeGroesseStart);
        hund4.setGroesse(3);
        System.out.println("Größe von " + hund4.getName() + " ist: " + hund4.getGroesse());

    }
}
