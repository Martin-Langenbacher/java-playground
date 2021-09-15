public class NutzungBlatt {

    public static void main(String[] args) {

        BeispielBlatt b1 = new BeispielBlatt(5);
        BeispielBlatt b2 = new BeispielBlatt(8);

        b1.verdoppeln();

        System.out.println(b1.getWert());
        System.out.println(BeispielBlatt.anzahlObjekte());

    }
}
