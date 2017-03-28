package cli;

import animal.Animal;
import cage.Cage;
import cell.Cell;
import person.Person;
import util.Position;
import zoo.Driver;
import zoo.Zoo;

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

    private boolean isInBound(Position pos) {
        return pos.row >= 0 && pos.row < zoo.getRow() && pos.col >=0 && pos.col < zoo.getCol();
    }
    private boolean isAnimalHere(int i,int j) {
        boolean f =false;
        for(Cage it : zoo.cages) {
            for(Animal jt : it.animals) {
                if(jt.getPosition().row == i && jt.getPosition().col == j) {
                    return true;
                }
            }
        }
        return false;
    }

    private char renderAnimal(int i,int j) {
        for(Cage it : zoo.cages) {
            for(Animal jt : it.animals) {
                if(jt.getPosition().row == i && jt.getPosition().col == j) {
                    return jt.render();
                }
            }
        }
        return '\0';
    }
    private void displayZoo() {
        for(int i=0; i<zoo.getRow(); i++) {
            for(int j=0;j<zoo.getCol(); j++) {
                if(player.getPosition().row == i && player.getPosition().col==j) {
                    System.out.print("P");
                } else if(isAnimalHere(i,j)) {
                    System.out.print(renderAnimal(i,j));
                } else {
                    System.out.print(zoo.getCell(i,j).render());
                }
            }
            System.out.println();
        }
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
    private boolean nextMove() {
        int x = player.getPosition().row;
        int y = player.getPosition().col;
        Vector<Integer> moves = new Vector<Integer>();
        Vector<Position> adj = new Vector<Position>();
        adj.add(Position.makePos(x-1,y));
        adj.add(Position.makePos(x,y-1));
        adj.add(Position.makePos(x+1,y));
        adj.add(Position.makePos(x,y+1));
        for(Position it : adj) {
            if(isInBound(it)) {
                Cell temp = zoo.getCell(it.row, it.col);
                if (temp.isInCage()) {
                    for (Cage jt : zoo.cages) {
                        if (jt.cells.contains(temp) && !interacted.contains(jt)) {
                            interacted.add(jt);
                            for (Animal kt : jt.animals) {
                                System.out.println(kt.getName()+ ": " + kt.interact());
                            }
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {

                            }
                        }
                    }
                }
            }
        }
        for(int i = 0; i<4;i++) {
            Position it = adj.get(i);
            if(isInBound(it)) {
                Cell temp = zoo.getCell(it.row,it.col);
                if(temp.isRoad() && !visited.contains(temp)) {
                    moves.add(i);
                }
            }
        }
        if(moves.size() > 0) {
            Random rand = new Random();
            int cx =moves.get(rand.nextInt(moves.size()));
            movePlayer(cx);
            return true;
        } else {
            return false;
        }
    }
    public void startTour() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        Random rand = new Random();
        int r = zoo.entrances.get(rand.nextInt(zoo.entrances.size())).row;
        int c = zoo.entrances.get(rand.nextInt(zoo.entrances.size())).col;
        player = new Person(new StringBuffer(scan.next()),Position.makePos(r,c));
        interacted = new HashSet<Cage>();
        visited = new HashSet<Cell>();
        System.out.println("Player Spawned at" + player.getPosition().row + " " +player.getPosition().col);
        do {
            try {
                Thread.sleep(100);
            } catch (InterruptedException x) {

            }
            System.out.print("\033[H\033[2J");
            displayZoo();
            visited.add(zoo.getCell(player.getPosition().row,player.getPosition().col));
        } while(nextMove() && !(zoo.getCell(player.getPosition().row,player.getPosition().col).isExit()));

        System.out.print("\033[H\033[2J");
        System.out.println("Tour Done");
    }
}
