package gui;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.Container;
import java.awt.event.*;
import java.beans.PropertyChangeListener;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.util.Scanner;
/**
 * Created by Irene Edria on 3/28/17.
 */
public class DisplayMenu extends JPanel {

    public static void introductionPanel() {
        JFrame frame = new JFrame();
        String text = "Welcome to FriendlyZoo. FriendlyZoo is\nan interactive virtual zoo. You can do many\nthings in here, have fun!";
        JOptionPane.showMessageDialog(frame, text, "Welcome!", JOptionPane.PLAIN_MESSAGE);
    };

    public JFrame frame = new JFrame("FriendlyZoo");

    public DisplayMenu() {

        introductionPanel();

        Container panel = frame.getContentPane();
        panel.setLayout(null);

        JButton button1 = new JButton ("1. Display Virtual Zoo");
        button1.setBackground(Color.black);
        button1.setBounds(90, 50, 220, 30);

        JButton button2 = new JButton("2. Tour Virtual Zoo");
        button1.setBackground(Color.black);
        button2.setBounds(90, 80, 220, 30);

        JButton button3 = new JButton("3. Display Food Portion");
        button3.setBackground(Color.black);
        button3.setBounds(90, 110, 220, 30);

        JButton button4 = new JButton("4. Exit");
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
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
