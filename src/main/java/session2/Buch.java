package session2;

public class Buch implements Comparable{

    String titel;

    public  Buch(String t) {
        titel = t;
    }

    @Override
    public int compareTo(Object b) {
        Buch buch = (Buch) b;
        return (titel.compareTo(buch.titel));
    }


    // überschriebene toString()-Methode
    public String toString(){
        return titel;
    }
}
