package Entwurfsmuster.Observer;

import javax.swing.*;
import java.awt.*;

public class SwingObserverBeispielLambda {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverBeispielLambda beispielLambda = new SwingObserverBeispielLambda();
        beispielLambda.go();
    }

    public void go() {
        frame = new JFrame();
        JButton button = new JButton("Soll ich es diesmal tun?");
        button.addActionListener(event -> System.out.println("Los, mach es jetzt!"));
        button.addActionListener(event -> System.out.println("Nein, nein, tue es nicht, du könntest es bereuen!"));


        // Button...
        frame.getContentPane().add(BorderLayout.CENTER, button);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }


    /*
	 * Remove these two inner classes to use lambda expressions instead.
	 *
	class AngelListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Don't do it, you might regret it!");
		}
	}

	class DevilListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Come on, do it!");
		}
	}
	*/


}
