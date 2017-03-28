package cage;

import animal.Animal;
import cell.Cell;
import util.Position;

import java.util.HashSet;
import java.util.List;

/**
 * Created by Richard on 28-Mar-17.
 */
public class Cage {
    public HashSet<Cell> cells = new HashSet<Cell>();
    public HashSet<Animal> animals = new HashSet<Animal>();
    private char type;

    public Cage(char _type) {
        type = _type;
    }
    public char getType() {
        return type;
    }
    private boolean isAnimalCompatible(int id) {
        boolean compatibility = true;
        for (Animal iterator : animals) {
            if (iterator.getIncompatible().contains(id)) {
                compatibility = false;
            }
        }
        return compatibility;
    }
    private boolean isHabitatCompatible(List<Character> hab) {
        boolean compatibility = true;
        for (Cell it : cells) {
            for (Character jt : hab) {
                if (it.GetHabitatType() == jt) {
                    compatibility = false;
                }
            }
        }
        return compatibility;
    }
    public void addAnimal(int id, StringBuffer name, int row, int col) {
        Animal buffer = new Animal(name, id, Position.makePos(row,col));
        if (isAnimalCompatible(id) && isHabitatCompatible(buffer.getHabitats())) {
            animals.add(buffer);
        }
    }
}
