package clientandserver;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TippDesTagesServer {

    String[] tippListe = {"Essen Sie weniger Chips und Schokolade.", "Holen Sie sich die engen Jeans. Nein, Sie sehen darin NICHT dick aus.", "Mit einem Wort: Unmöglich!", "Seien Sie ehrlich nur heute. Sagen Sie Ihrem Chef, was Sie *wirklich* denken.", "Sie sollten wirklich mal wieder zum Friseur gehen..."};

    private void los() {
        try {
            ServerSocket serverSocket = new ServerSocket(4242);

            while (true) {
                Socket sock = serverSocket.accept();

                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String tipp = getTipp();
                writer.println(tipp);
                writer.close();
                System.out.println(tipp);

            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }  // los() schließen

    private String getTipp() {
        int zufallszahl = (int) (Math.random() * tippListe.length);
        return tippListe[zufallszahl];
    }

    public static void main(String[] args) {
        TippDesTagesServer server = new TippDesTagesServer();
        server.los();
    }


}
