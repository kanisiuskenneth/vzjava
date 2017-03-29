// File : DisplayFoodPortion.java

package gui;

import zoo.Driver;
import zoo.Zoo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Irene Edria on 3/28/17.
 */

/**
 * Class DisplayFoodPortion
 * Class graphical user interface untuk menampilkan porsi makanan yang diperlukan Zoo
 */
class DisplayFoodPortion extends JPanel {
  private final Zoo zoo = Driver.zoo;

  /**
   * Class constructor.
   */
  public DisplayFoodPortion() {
  JFrame frame = new JFrame ("Display Food Portion");

  Container panel = frame.getContentPane();
  panel.setLayout(null);

  JButton button1 = new JButton("Carnivore");
  button1.setBackground(Color.black);
  button1.setBounds(50,200,150,30);
  panel.add(button1);

  JButton button2 = new JButton("Herbivore");
  button2.setBackground(Color.black);
  button2.setBounds(200,200,150,30);
  panel.add(button2);

  JButton button3 = new JButton("Back to Main Menu");
  button3.setBackground(Color.black);
  button3.setBounds(100,230,200,30);
  panel.add(button3);

  frame.setSize(400,300);
  frame.setLocationRelativeTo(null);
  frame.setVisible(true);

  JLabel label1 = new JLabel ("kg");
  label1.setBounds(220,100,30,30);
  panel.add(label1);

  JLabel label2 = new JLabel ("...");
  label2.setBounds(160,100,100,30);
  panel.add(label2);

  button1.addActionListener(
    new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    label2.setText(String.valueOf(zoo.getFoodPortionCarnivore()));
    }
    }
  );

  button2.addActionListener(
    new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    label2.setText(String.valueOf(zoo.getFoodPortionHerbivore()));
    }
    }
  );

  button3.addActionListener(
    new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    frame.dispose();
    }
    }
  );

  }
}
