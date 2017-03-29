// File : Cage.java

package cage;

import animal.Animal;
import cell.Cell;
import util.Position;

import java.util.HashSet;
import java.util.List;

/**
 * Created by Ferdinandus Richard on 28-Mar-17.
 */

/**
 * Class Cage
 */
public class Cage {
    public HashSet<Cell> cells = new HashSet<Cell>();
    public HashSet<Animal> animals = new HashSet<Animal>();
    private char type;

    /**
     * Class constructor.
     * @param _type tipe dari Cage yang akan dibentuk
     *              'l' berarti Cage berisi LandHabitat
     *              'w' berarti Cage berisi WaterHabitat
     *              'a' berarti Cage berisi AirHabitat
     */
    public Cage(char _type) {
        type = _type;
    }

    /**
     * @return type dari Cage
     */
    public char getType() {
        return type;
    }

    /**
     * Predikat untuk menentukan apakah sebuah Animal dapat ditempatkan dalam cage jika dilihat dari keberadaan Animal lain
     * @param id identifier Animal yang akan dicek kompatibilitasnya
     * @return boolean kompabilitas penempatan Animal ke dalam Cage
     */
    private boolean isAnimalCompatible(int id) {
        boolean compatibility = true;
        for (Animal iterator : animals) {
            if (iterator.getIncompatible().contains(id)) {
                compatibility = false;
            }
        }
        return compatibility;
    }

    /**
     * Predikat untuk menentukan apakah sebuah Animal dapat ditempatkan dalam Cage jika dilihat dari Habitatnya
     * @param hab list of character yang merupakan habitat yang dapat ditinggali Animal
     * @return boolean kompabilitas penempatan Animal ke dalam Cage
     */
    private boolean isHabitatCompatible(List<Character> hab) {
        boolean compatibility = false;
        for (Cell it : cells) {
            for (Character jt : hab) {
                if (it.GetHabitatType() == jt) {
                    compatibility = true;
                }
            }
        }
        return compatibility;
    }

    /**
     * Method untuk menambahkan Animal ke dalam Cage
     * I.S. : Cage terdefinisi
     * F.S. : Animal ditambahkan ke dalam Cage jika compatible dengan Cage
     * @param id identifier dari Animal yang ingin ditambahkan
     * @param name nama dari Animal yang ingin ditambahkan
     * @param row posisi baris dari Animal yang ingin ditambahkan
     * @param col posisi kolom dari Animal yang ingin ditambahkan
     */
    public void addAnimal(int id, StringBuffer name, int row, int col) {
        Animal buffer = new Animal(name, id, Position.makePos(row, col));
        if (isAnimalCompatible(id) && isHabitatCompatible(buffer.getHabitats())) {
            animals.add(buffer);
        }
    }
}
