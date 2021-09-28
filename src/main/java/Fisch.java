public abstract class Fisch {

    // 1. Eine abstract Class ist eine Klasse von der man keine Instanz / Object "machen" kann.

    // 2. Lachs extends Fisch.

    // 3. Lachs implements (Interface) Kiemen
    //    --> darum muss der Lachs die Methode "mitKiemenAtmen()" implementieren (@Override)

    private static int n = 0;

    protected Fisch() {
        n++;
    }

    public static int anzahlFische(){
        return n;
    }

    public  void schwimmen() {
        System.out.println("Fische schwimmen (aus der Klasse Fische).");
    }

    // Getter & Setter
    /*
    public static int getN() {
        return n;
    }

    public static void setN(int n) {
        Fisch.n = n;


    } */
}
