package clientandserver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EinfacherChatClient {

    JTextArea eingehend;
    JTextField ausgehend;
    BufferedReader reader;
    PrintWriter writer;
    Socket sock;

    public static void main(String[] args) {
        EinfacherChatClient client = new EinfacherChatClient();
        client.los();
    }


    private void los() {
        JFrame frame = new JFrame("Lächerlich einfacher Chat-Client");
        JPanel hauptPanel = new JPanel();
        eingehend = new JTextArea(15,20);
        eingehend.setLineWrap(true);
        eingehend.setWrapStyleWord(true);
        eingehend.setEditable(false);

        JScrollPane fScroller = new JScrollPane(eingehend);
        fScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        fScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        ausgehend = new JTextField(20);
        JButton sendenButton = new JButton("Senden");
        sendenButton.addActionListener(new SendenButtonListener());
        hauptPanel.add(fScroller);
        hauptPanel.add(ausgehend);
        hauptPanel.add(sendenButton);
        netzwerkEinrichten();

        Thread readerThread = new Thread(new EingehendReader());
        readerThread.start();

        frame.getContentPane().add(BorderLayout.CENTER, hauptPanel);
        frame.setSize(400, 500);
        frame.setVisible(true);
    }


    private void netzwerkEinrichten() {
        try {
            sock = new Socket("127.0.0.1", 5000);
            InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
            reader = new BufferedReader(streamReader);
            writer = new PrintWriter(sock.getOutputStream());
            System.out.println("Netzwerkverbindung steht");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    } // netzwerkEinrichten schließen


    public class SendenButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            try {
                writer.println(ausgehend.getText());
                writer.flush();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            ausgehend.setText("");
            ausgehend.requestFocus();
        }
    } // innere Klasse SendenButtonListener schließen


    public class EingehendReader implements Runnable {

        @Override
        public void run() {
            String nachricht;
            try {
                while (((nachricht = reader.readLine())) != null) {
                    System.out.println("gelesen: " + nachricht);
                    eingehend.append(nachricht + "\n");

                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } // run schließen
    } // innere Klasse Eingehender Reader schließen

} // äußere Klasse schließen
