public abstract class Fisch {

    private static int n = 0;

    public static int anzahlFische(){
        return n;
    }

    public  void schwimmen() {
        System.out.println("Fische schwimmen");
    }

    // Getter & Setter
    public static int getN() {
        return n;
    }

    public static void setN(int n) {
        Fisch.n = n;
    }
}
