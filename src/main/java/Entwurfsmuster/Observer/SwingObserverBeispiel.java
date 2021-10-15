package Entwurfsmuster.Observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverBeispiel {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverBeispiel beispiel = new SwingObserverBeispiel();
        beispiel.go();
    }

    public void go() {
        frame = new JFrame();
        JButton button = new JButton("Soll ich es tun?");
        button.addActionListener(new EngelListener());
        button.addActionListener(new TeufelListener());

        // hier werden die Frame-Eigenschaften gesetzt
        frame.getContentPane().add(BorderLayout.CENTER, button);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    class EngelListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.out.println("Tu es nicht, du könntest es bereuen!");
        }
    }

    class TeufelListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.out.println("Los, mach es!");
        }
    }
}
