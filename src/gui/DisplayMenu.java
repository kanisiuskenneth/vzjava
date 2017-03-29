// File : DisplayMenu.java

package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;

/**
 * Created by Irene Edria on 3/28/17.
 */

/**
 * Class DisplayMenu
 * Class graphical user interface untuk menampilkan menu awal dan memilih menu
 */
public class DisplayMenu extends JPanel {
  /**
   * Method untuk menampilkan panel introduksi
   * I.S. : -
   * F.S. : Kata-kata sambutan ke VirtualZoo ditampilkan ke layar
   */
  private static void introductionPanel() {
    JFrame frame = new JFrame();
    String text = "Welcome to FriendlyZoo. FriendlyZoo is\nan interactive virtual zoo. You can do many\nthings in here, have fun!";
    JOptionPane.showMessageDialog(frame, text, "Welcome!", JOptionPane.PLAIN_MESSAGE);
  }

    private final JFrame frame = new JFrame("FriendlyZoo");

  /**
   * Class constructor.
   */
  public DisplayMenu() {

    introductionPanel();

    Container panel = frame.getContentPane();
    panel.setLayout(null);

    JButton button1 = new JButton ("Display Virtual Zoo");
    button1.setBackground(Color.black);
    button1.setBounds(90, 50, 220, 30);

    JButton button2 = new JButton("Tour Virtual Zoo");
    button1.setBackground(Color.black);
    button2.setBounds(90, 80, 220, 30);

    JButton button3 = new JButton("Display Food Portion");
    button3.setBackground(Color.black);
    button3.setBounds(90, 110, 220, 30);

    JButton button4 = new JButton("Exit");
    button4.setBackground(Color.black);
    button4.setBounds(90, 140, 220, 30);


    panel.add(button1);
    panel.add(button2);
    panel.add(button3);
    panel.add(button4);


    button1.addActionListener(
        new ActionListener() {
          @Override
          public void actionPerformed (ActionEvent e){
            DisplayVirtualZoo buff = new DisplayVirtualZoo();
          }
        }
    );

    button2.addActionListener(
        new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            TourVirtualZoo buff = new TourVirtualZoo();
          }
        }
    );

    button3.addActionListener(
        new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            DisplayFoodPortion buff = new DisplayFoodPortion();
          }
        }
    );

    button4.addActionListener(
        new ActionListener() {
          @Override
          public void actionPerformed (ActionEvent e) {
            System.exit(0);
          }
        }
    );

    frame.setSize(400, 300);
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
    frame.setResizable(true);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

  }
}
