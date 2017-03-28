// File : TourVirtualZoo.java

package cli;

import animal.Animal;
import cage.Cage;
import cell.Cell;
import cell.Exit;
import cell.Habitat;
import cell.Road;
import person.Person;
import util.Position;
import zoo.Driver;
import zoo.Zoo;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

/**
 * Created by Kanisius Kenneth Halim on 3/28/17.
 */

/**
 * Class TourVirtualZoo
 * Class command line interface untuk melakukan tour di virtual zoo
 */
public class TourVirtualZoo {
    private Zoo zoo = Driver.zoo;
    private Person player = null;
    private HashSet<Cell> visited = null;
    private HashSet<Cage> interacted = null;

    /**
     * Predikat apakah posisi berada di dalam zoo
     * @param pos posisi yang ingin dicek
     * @return boolean apakah pos berada di dalam lingkup zoo
     */
    private boolean isInBound(Position pos) {
        return pos.row >= 0 && pos.row < zoo.getRow() && pos.col >=0 && pos.col < zoo.getCol();
    }

    /**
     * Predikat keberadaan animal dalam sebuah Cell
     * @param row baris yang ingin dicek keberadaan Animalnya
     * @param col kolom yang ingin dicek keberadaan Animalnya
     * @return boolean keberadaan Animal dalam koordinat Cell
     */
    private boolean isAnimalHere(int row, int col) {
        for(Cage it : zoo.cages) {
            for(Animal jt : it.animals) {
                if(jt.getPosition().row == row && jt.getPosition().col == col) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Method untuk melakukan render Animal
     * @param i baris dalam zoo tempat Animal ingin dirender
     * @param j kolom dalam zoo tempat Animal ingin dirender
     * @return character render dari Animal jika ada, null jika tidak ada
     */
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

    /**
     * Method untuk menampilkan isi zoo
     * I.S. : -
     * F.S. : Se-isi zoo ditampilkan beserta Animal dan Personnya
     */
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

    /**
     * Method untuk menggerakan player di dalam zoo
     * I.S. : Posisi Person terdefinisi
     * F.S. : Posisi Person sudah berubah sesuai movement
     * @param movement arah gerakan yang akan dilakukan oleh Person
     *                 0 berarti bergerak ke atas
     *                 1 berarti bergerak ke kiri
     *                 2 berarti bergerak ke bawah
     *                 3 berarti bergerak ke kanan
     */
    private void movePlayer(int movement) {
        switch (movement) {
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

    /**
     * Method untuk menentukan jalan selanjutnya dari Person
     * @return boolean keberadaan jalan selanjutnya yang dapat diambil
     */
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
                if (temp instanceof Habitat && ((Habitat) temp).isInCage()) {
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
                if(temp instanceof Road && !visited.contains(temp)) {
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

    /**
     * Method untuk melakukan tour di virtual zoo
     * I.S. : -
     * F.S. : Tour berakhir dengan tidak ada jalan lagi atau sudah mencapai exit
     */
    public void startTour() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        int r = zoo.entrances.get((int)Math.random()).row;
        int c = zoo.entrances.get((int)Math.random()).col;
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
        } while(nextMove() && !(zoo.getCell(player.getPosition().row,player.getPosition().col) instanceof Exit ));

        System.out.print("\033[H\033[2J");
        System.out.println("Tour Done");
    }
}
