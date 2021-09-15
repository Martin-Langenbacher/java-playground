import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eingabe {

    public String eingabeHilfsMethode(String prompt) throws IOException {
        String eingabeZeile = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            eingabeZeile = is.readLine();
            if (eingabeZeile.length() == 0 ) {
                return null;
            }
        } catch (IIOException e) {
            System.out.println("IOExcepton: " + e );
        }

        return eingabeZeile;
    }


/*

    // Methode:
    public String hilfsMethode() {
        return "Dies ist eine Hilfe-Message";
    }

    */

    // eingabeHilfsMethode



}
