import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LiesEineDatei {

    public static void main(String[] args) {
        try {
            File meineDatei = new File("/Users/martin/Lernen/Markus/java-playground/src/MeinText.txt");
            FileReader fileReader = new FileReader(meineDatei);

            BufferedReader reader = new BufferedReader(fileReader);

            String zeile = null;

            while ((zeile = reader.readLine()) != null ) {
                System.out.println(zeile);
            }
            reader.close();
        } catch (java.lang.Exception exception) {
            exception.printStackTrace();
        }
    }
}
