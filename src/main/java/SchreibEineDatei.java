import java.io.FileWriter;
import java.io.IOException;

public class SchreibEineDatei {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("/Users/martin/Lernen/Markus/java-playground/src/duda.txt");

            writer.write("Hallo, du da!");

            writer.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
