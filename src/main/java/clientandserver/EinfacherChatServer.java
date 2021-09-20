package clientandserver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class EinfacherChatServer {

    // Um den Chat-Client auszuführen, brauchen Sie zwei Kommandozeilen-Fenster.
    // Starten Sie als Erstes diesen Server in einem Kommandozeilen-Fenster,
    // dann starten Sie den Client in einem zweiten.

    ArrayList clientAusgabeStröme;

    public class ClientHandler implements Runnable {
        BufferedReader reader;
        Socket sock;

        public ClientHandler(Socket clientSocket) {
            try {
                sock = clientSocket;
                InputStreamReader isReader = new InputStreamReader(sock.getInputStream());
                reader = new BufferedReader(isReader);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } // Konstruktor schließen

        @Override
        public void run() {
            String nachricht;
            try {
                while ((nachricht = reader.readLine()) != null) {
                    System.out.println("gelesen: " + nachricht);
                    esAllenWeitersagen(nachricht);
                } // Ende der while-Schleife
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } // run schließen
    } // innere Klasse schließen



    public static void main(String[] args) {
        new EinfacherChatServer().los();
    }

    private void los() {
        clientAusgabeStröme = new ArrayList();

        try {
            ServerSocket serverSocket = new ServerSocket(5000);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
                clientAusgabeStröme.add(writer);
                Thread t = new Thread(new ClientHandler(clientSocket));
                t.start();
                System.out.println("Habe eine Verbindung");
            }
            // Wenn wir hier angelangt sind, haben wir eine Verbindung.

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void esAllenWeitersagen(String nachricht) {

        Iterator iterator = clientAusgabeStröme.iterator();
        while (iterator.hasNext()) {
            try {
                PrintWriter writer = (PrintWriter) iterator.next();
                writer.println(nachricht);
                writer.flush();

            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }  // esAllenWeitersagen schließen


} // Klasse schließen
