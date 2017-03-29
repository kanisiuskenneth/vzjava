package gui;

import animal.Animal;
import cage.Cage;
import cell.Cell;
import cell.Habitat;
import cell.Road;
import person.Person;
import util.Position;
import zoo.Driver;
import zoo.Zoo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

/**
 * Created by kennethhalim on 3/28/17.
 */

public class TourVirtualZoo {
    private Zoo zoo = Driver.zoo;
    private Person player = null;
    private HashSet<Cell> visited = null;
    private HashSet<Cage> interacted = null;
    private JFrame display;
    private JLabel map;
    private JLabel log;
    private StringBuffer logtext;
    Timer timer;
    Container panel;


    private boolean isInBound(Position pos) {
        return pos.row >= 0 && pos.row < zoo.getRow() && pos.col >= 0 && pos.col < zoo.getCol();
    }

    private boolean isAnimalHere(int i, int j) {
        boolean f = false;
        return zoo.getCell(i, j) instanceof Habitat && zoo.getCell(i, j).getAnimal() != null;
    }

    private char renderAnimal(int i, int j) {
        return zoo.getCell(i, j).getAnimal().render();
    }

    private void movePlayer(int i) {
        switch (i) {
            case 0:
                player.moveUp();
                break;
            case 1:
                player.moveLeft();
                break;
            case 2:
                player.moveDown();
                break;
            case 3:
                player.moveRight();
                break;
        }
    }

    private StringBuffer renderZoo() {
        StringBuffer ret = new StringBuffer("<html>");
        for (int i = 0; i < zoo.getRow(); i++) {
            for (int j = 0; j < zoo.getCol(); j++) {
                if (i == player.getPosition().row && j == player.getPosition().col) {
                    ret.append("P");
                }
                else if (isAnimalHere(i, j)) {
                    ret.append(renderAnimal(i, j));
                } else {
                    ret.append(zoo.getCell(i, j).render());
                }
            }
            ret.append("<br>");
        }
        return ret;
    }

    private boolean nextMove() {
        int x = player.getPosition().row;
        int y = player.getPosition().col;
        Vector<Integer> moves = new Vector<Integer>();
        Vector<Position> adj = new Vector<Position>();
        adj.add(Position.makePos(x - 1, y));
        adj.add(Position.makePos(x, y - 1));
        adj.add(Position.makePos(x + 1, y));
        adj.add(Position.makePos(x, y + 1));
        for (Position it : adj) {
            if (isInBound(it)) {
                Cell temp = zoo.getCell(it.row, it.col);
                if (temp instanceof Habitat && ((Habitat) temp).isInCage()) {
                    for (Cage jt : zoo.cages) {
                        if (jt.cells.contains(temp) && !interacted.contains(jt)) {
                            interacted.add(jt);
                            for (Animal kt : jt.animals) {
                               logtext.append(kt.getName() + ": " + kt.interact()+ "<br>");
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            Position it = adj.get(i);
            if (isInBound(it)) {
                Cell temp = zoo.getCell(it.row, it.col);
                if (temp instanceof Road && !visited.contains(temp)) {
                    moves.add(i);
                }
            }
        }
        if (moves.size() > 0) {
            Random rand = new Random();
            int cx = moves.get(rand.nextInt(moves.size()));
            movePlayer(cx);
            return true;
        } else {
            return false;
        }
    }

    private void displayZoo() {

    }

    private void controller() {
        nextMove();
        displayZoo();
    }

    public TourVirtualZoo() {
        player = new Person(new StringBuffer("ken"), Position.makePos(24, 71));
        display = new JFrame("VirtualZoo");
        display.setSize(850, 500);
        display.setLocationRelativeTo(null);
        JLabel head = new JLabel("VirtualZoo Tour");
        head.setHorizontalAlignment(SwingConstants.CENTER);
        head.setFont(new Font("Arial", Font.BOLD,24));
        display.setVisible(true);
        panel = display.getContentPane();
        panel.setLayout(new BorderLayout());
        interacted = new HashSet<Cage>();
        visited = new HashSet<Cell>();
        map = new JLabel(renderZoo().toString());
        map.setFont(new Font("Courier", 0, 14));
        logtext = new StringBuffer("<html><h3>Log</h3>");
        log = new JLabel(logtext.toString());
        log.setMinimumSize(new Dimension(200,500));
        log.setVerticalAlignment(SwingConstants.TOP);
        log.setHorizontalAlignment(SwingConstants.LEFT);
        log.setFont(new Font("Helvetica",Font.PLAIN,12));
        panel.add(map,BorderLayout.WEST);
        panel.add(log,BorderLayout.CENTER);
        panel.add(head,BorderLayout.NORTH);
        boolean f=true;
        JButton back = new JButton("Back to Main Menu");
        back.setBackground(Color.black);
        back.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        display.dispose();
                    }
                }
        );

        timer = new Timer(200, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                visited.add(zoo.getCell(player.getPosition().row,player.getPosition().col));
                if(!nextMove()) {
                    timer.stop();
                    logtext.append("<font color=red>Tour Finished</font>");
                    panel.add(back,BorderLayout.SOUTH);
                }
                map.setText(renderZoo().toString());
                log.setText(logtext.toString());
            }
        });
        timer.start();

    }
}