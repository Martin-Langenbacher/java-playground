package session2.AnhangB;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestAnon {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JButton button = new JButton("click");
        frame.getContentPane().add(button);
        // Üblicherweise würden wir in etwas Folgendes machen - eine Referenz zu einer Instanz einer inneren Klasse übergeben...
        // einer inneren Klasse die ActionListener (und die Methode actionPerformed()) implementiert
        // button.addActionListener(quitListener);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
