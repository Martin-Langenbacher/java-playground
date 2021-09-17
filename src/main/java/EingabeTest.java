import java.io.IOException;

public class EingabeTest {

    public static void main(String[] args) throws IOException {

        System.out.println("==========================================");
        System.out.println("==========>>>   Eingabe   <<<=============");
        System.out.println("==========================================");
        System.out.println();

        Eingabe eingabe = new Eingabe();
        String diesIstDieEingabe = eingabe.eingabeHilfsMethode("Geben Sie eine Zahl ein: ");
        System.out.println();
        System.out.println("Du hast folgendes eingegeben:");
        System.out.println(diesIstDieEingabe);


    }
}
