// File : DisplayVirtualZoo.java

package gui;

import animal.Animal;
import zoo.Driver;
import zoo.Zoo;
import cage.Cage;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

/**
 * Created by Irene Edria on 3/28/17.
 */

/**
 * Class DisplayVirtualZoo
 * Class graphical user interface untuk menampilkan peta
 */
public class DisplayVirtualZoo {

    private Zoo zoo = Driver.zoo;

    /**
     * Predikat untuk menentukan keberadaan Animal dalam koordinat
     * @param row baris yang ingin ditentukan keberadaan Animalnya
     * @param col kolom yang ingin ditentukan keberadaan Animalnya
     * @return boolean keberadaan Animal dalam koordinat
     */
    private boolean isAnimalHere(int row, int col) {
        for (Cage it : zoo.cages) {
            for (Animal jt : it.animals) {
                if (jt.getPosition().row == row && jt.getPosition().col == col) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Method untuk mendapatkan karakter Animal yang ada dalam koordinat
     * @param i baris dari Animal yang ingin diambil karakternya
     * @param j kolom dari Animal yang ingin diambil karakternya
     * @return karakter dari Animal yang ada, null jika tidak ada
     */
    private char renderAnimal(int i, int j) {
        for (Cage it : zoo.cages) {
            for (Animal jt : it.animals) {
                if (jt.getPosition().row == i && jt.getPosition().col == j) {
                    return jt.render();
                }
            }
        }
        return ' ';
    }


    /**
     * Predikat apakah sebuah koordinat berada dalam Zoo atau tidak
     * @param i baris yang ingin dicek apakah berada dalam Zoo
     * @param j kolom yang ingin dicek apakah berada dalam Zoo
     * @return boolean koordinat berada dalam Zoo
     */
    private boolean isInBound(int i, int j) {
        return i > 0 && i <= zoo.getRow() && j > 0 && j <= zoo.getCol();
    }

    /**
     * Class constructor.
     */
    public DisplayVirtualZoo() {


        // Frame Insert Coordinate
        JFrame frameinsert = new JFrame("Enter Coordinate");
        frameinsert.setSize(400, 300);
        frameinsert.setLocationRelativeTo(null);
        frameinsert.setVisible(true);

        Container panelinsert = frameinsert.getContentPane();
        panelinsert.setLayout(null);

        JButton buttonok = new JButton("Ok");
        buttonok.setBounds(100, 200, 100, 30);
        panelinsert.add(buttonok);

        JButton buttonclear = new JButton("Clear");
        buttonclear.setBounds(200, 200, 100, 30);
        panelinsert.add(buttonclear);


        JLabel label1 = new JLabel("Top Left Coordinate: ");
        label1.setBounds(80, 50, 200, 30);
        panelinsert.add(label1);

        //top
        JTextField textinput1 = new JTextField("");
        textinput1.setBounds(270, 50, 30, 30);
        panelinsert.add(textinput1);

        //left
        JTextField textinput2 = new JTextField("");
        textinput2.setBounds(300, 50, 30, 30);
        panelinsert.add(textinput2);

        JLabel label3 = new JLabel("Bottom Right Coordinate : ");
        label3.setBounds(80, 100, 200, 30);
        panelinsert.add(label3);

        //bottom
        JTextField textinput3 = new JTextField("");
        textinput3.setBounds(270, 100, 30, 30);
        panelinsert.add(textinput3);

        //right
        JTextField textinput4 = new JTextField("");
        textinput4.setBounds(300, 100, 30, 30);
        panelinsert.add(textinput4);


        buttonclear.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textinput1.setText("");
                        textinput2.setText("");
                        textinput3.setText("");
                        textinput4.setText("");
                    }
                }
        );

        buttonok.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int top = Integer.parseInt(textinput1.getText());
                        int left = Integer.parseInt(textinput2.getText());
                        int bottom = Integer.parseInt(textinput3.getText());
                        int right = Integer.parseInt(textinput4.getText());

                        if (top >= 1 && left >= 1 && bottom >= top && right >= left) {
                            frameinsert.dispose();
                            JFrame frame = new JFrame("Display Virtual Zoo");
                            frame.setSize(850, 500);
                            frame.setLocationRelativeTo(null);
                            frame.setVisible(true);

                            Container panel = frame.getContentPane();
                            panel.setLayout(null);

                            JButton button1 = new JButton("Back to Main Menu");
                            button1.setBounds(0, 400, 200, 30);
                            panel.add(button1);
                            button1.addActionListener(
                                    new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            frame.dispose();
                                        }
                                    }
                            );

                            for (int i = top - 1; i <= bottom - 1; i++) {
                                for (int j = left - 1; j <= right - 1; j++) {
                                    if (isAnimalHere(i, j)) {
                                        String text = Character.toString(renderAnimal(i, j));
                                        JLabel label = new JLabel(text);
                                        label.setBounds((10 * j), (15 * i), 100, 30);
                                        panel.add(label);
                                    } else {
                                        String text = Character.toString(zoo.getCell(i, j).render());
                                        JLabel label = new JLabel(text);
                                        label.setBounds((j * 10), (i * 15), 100, 30);
                                        panel.add(label);
                                    }

                                }
                            }
                        } else {
                            textinput1.setText("");
                            textinput2.setText("");
                            textinput3.setText("");
                            textinput4.setText("");
                        }

                    }
                }
        );
    }
}