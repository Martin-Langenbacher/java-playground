import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class EingabeTest {

    private static boolean zahlEingeben = true;

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int richtigeZahl = 0;

        List<Integer> myListOfIntegers = new ArrayList<>();
        //List<Integer> list = new ArrayList<Integer>();
        //list.add(5);
        //ArrayList<StringObject> meinStringTestListe = new ArrayList<StringObject>();


        System.out.println("==========================================");
        System.out.println("==========>>>   Eingabe   <<<=============");
        System.out.println("==========================================");
        System.out.println();

        Eingabe eingabe = new Eingabe();
        String diesIstDieEingabe = eingabe.eingabeHilfsMethode("Geben Sie eine Zahl ein: ");
        System.out.println();
        System.out.println("Du hast folgendes eingegeben:");
        System.out.println(diesIstDieEingabe);

        // Wirkliche Zahl eingeben
        System.out.println("Now only a number works:");
        while (zahlEingeben) {
            try {
                System.out.println("Bitte geben Sie eine Zahl ein:\n");
                String eingabeZahl = br.readLine();
                richtigeZahl = Integer.parseInt(eingabeZahl);
            } catch (NumberFormatException exception) {
                System.out.println("Bitte eine ZAHL eingeben !!!");
                continue;
            }
            zahlEingeben = false;
        }

        System.out.println("Die Zahl ist: " + richtigeZahl);
        System.out.println();
        System.out.println("Mathe: " + richtigeZahl +" + 2 = " +(richtigeZahl+2));

        System.out.println("==============================================================");
        String testString = "12/Ab hier wird getrennt/18/22/Ende/8/-55";
        System.out.println("Dies ist der testString ===>> " + testString);

        System.out.println("===>> Hier startet das 'split':");
        String[] stringArray = testString.split("/");
        for (String token:stringArray) {
            System.out.println(token);
        }

        System.out.println("==============================================================");
        boolean stringIsNumber = false;
        int zahlForList;
        for (int i = 0; i < stringArray.length; i++) {
            // String oder Zahl

            if (checkStringifNumber(stringArray[i])) {
                System.out.println("String-Teil " +(i+1) +": " +stringArray[i] + " (Zahl)");
                zahlForList = Integer.parseInt(stringArray[i]);

                myListOfIntegers.add(zahlForList);
                //StringObject martin = new StringObject()
            } else {
                System.out.println("String-Teil " +(i+1) +": " +stringArray[i] + " (String)");
            }
            // richtigeZahl = Integer.parseInt(eingabeZahl);


        }
        System.out.println("==============================================================");
        System.out.println("Mathe:");
        int ergebnis = 0;
        for (int i = 0; i < myListOfIntegers.size(); i++) {
            ergebnis = ergebnis + myListOfIntegers.get(i);
            // System.out.println(myListOfIntegers.get(i));
            System.out.print(myListOfIntegers.get(i));
            if (i < (myListOfIntegers.size())-1) {
                System.out.print(" + ");
            } else {
                System.out.print(" = ");
            }
        }
        System.out.print(ergebnis);
        // System.out.println(stringArray[0].toString());




        // Mathe Aufgabe / cast




        /*
        public static boolean isNumeric(String str) {
  try {
    Double.parseDouble(str);
    return true;
  } catch(NumberFormatException e){
    return false;
  }
}
         */



    }

    private static boolean checkStringifNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
