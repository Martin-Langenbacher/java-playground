package session2.AnhangB;

public class StringBuilderLong {

    public static void main(String[] args) {
        System.out.println("This is to show String & StringBuilder things:");
        String zahlen = "0123456789";
        String wort = "Hausmeister";
        String trimWort = "      Trim am Anfang und am Ende!       ";
        int eineIntZahl = 4;
        char einChar = 'A';
        StringBuilder stringbuilderwort = new StringBuilder("Vogel");

        System.out.println(zahlen);
        System.out.println(wort);
        System.out.println(stringbuilderwort);
        System.out.println();

        int lenght = wort.length();
        String substring = zahlen.substring(0,5);
        int charPosition = 9;
        System.out.println("Länge von '" + wort + "' = " +lenght);
        System.out.println("Substring von '" + zahlen +"' --> (0,5) = " + substring);
        System.out.println("Welches Zeichen ist an Position " + charPosition +" von " +zahlen +"? --> " + zahlen.charAt(charPosition));
        System.out.println(wort.charAt(3));

        String concat = zahlen.concat(wort);
        StringBuilder append = stringbuilderwort.append(zahlen).append(wort);
        System.out.println(concat);
        System.out.println(append);
        String ersetzen = wort.replace('e', 'X');
        System.out.println(ersetzen);
        char[] charTransfer = wort.toCharArray();
        System.out.println("charTransfer: We show char at position 0: " + charTransfer[0]);

        System.out.println("lowerCase: " + wort.toLowerCase());
        System.out.println("UPPER-CASE: " + wort.toUpperCase());

        System.out.println("Länge nächster String: " + trimWort.length() + " vor dem trimmen...");
        System.out.println(trimWort);

        System.out.println("Länge nächster String: " + trimWort.trim().length() + " nach trim()");
        System.out.println(trimWort.trim());

        System.out.println("valueOf -------------------------->>");
        Integer a = 35;
        Integer b = -45;
        //It returns a Integer instance representing the specified int value
        System.out.println("Value = " + a.valueOf(2));
        System.out.println(a);
        System.out.println("Value = " + b.valueOf(-5));

        System.out.println(stringbuilderwort);
        System.out.println(append);
        stringbuilderwort.delete(5,361);
        System.out.println(stringbuilderwort);
        StringBuilder reverse = stringbuilderwort.reverse();
        System.out.println("Reverse: " + reverse);


        System.out.println("=======================================================");
        // create a StringBuilder object
        // with a String pass as parameter
        StringBuilder str
                = new StringBuilder("WelcomeGeeks");

        // print string
        System.out.println("String = "
                + str.toString());

        // set char at index 2 to 'L'
        str.setCharAt(2, 'L');

        // print string
        System.out.println("After setCharAt() String = "
                + str.toString());

    }






}
