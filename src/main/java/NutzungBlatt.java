public class NutzungBlatt {

    public static void main(String[] args) {

        BeispielBlatt b1 = new BeispielBlatt(5);
        BeispielBlatt b2 = new BeispielBlatt(8);
        BeispielBlatt b3 = new BeispielBlatt(8);
        BeispielBlatt b4 = new BeispielBlatt(8);

        b1.verdoppeln();
        b2.verdreifachen();

        System.out.println(b1.getWert());
        System.out.println(b2.getWert());
        System.out.println(BeispielBlatt.anzahlObjekte());
    }
}
