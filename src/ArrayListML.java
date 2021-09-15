import java.util.ArrayList;

public class ArrayListML {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("=========>>>   ArrayList   <<<============");
        System.out.println("==========================================");
        System.out.println();

        ArrayList<String> meineStringListe = new ArrayList<>();
        String s1 = new String("Hallo");
        String s2 = new String("Martin");
        meineStringListe.add(s1);
        meineStringListe.add(s2);

        int theSize = meineStringListe.size();

        System.out.println(meineStringListe.toString());
        System.out.println("Größe: " + theSize);


    }
}


