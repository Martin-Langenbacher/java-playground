package session2;

import java.util.HashMap;

public class TestMap {

    public static void main(String[] args) {

        HashMap<String, Integer> punktzahlen = new HashMap<String, Integer>();

        punktzahlen.put("Melanie", 42);
        punktzahlen.put("Claus", 99);
        punktzahlen.put("Max", 343);
        punktzahlen.put("Miriam", 420);
        punktzahlen.put("Alfred", 90);
        punktzahlen.put("Bernd", 91);

        System.out.println(punktzahlen);
        System.out.println(punktzahlen.get("Max"));
        System.out.println(punktzahlen.get("Bernd"));
    }
}
