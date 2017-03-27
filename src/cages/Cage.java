package cages;

import animal.*;
import animal.Chimpanzee;
import cell.Cell;
import cell.Habitat;

import java.util.HashSet;
import java.util.List;

/**
 * Created by kennethhalim on 3/27/17.
 */
public class Cage {
    public HashSet<Cell> cells = new HashSet<Cell>();
    public HashSet<Animal> animals = new HashSet<Animal>();

    public Cage(HashSet<Cell> c, HashSet<Animal> a) {
        cells = c;
        animals = a;
    }
    private boolean isAnimalCompatible(int id) {
        boolean f = true;
        for(Animal it : animals) {
            if(it.getIncompatible().contains(id)) {
                f = false;
            }
        }
        return f;
    }
    private boolean isHabitatCompatible(List<Character> hab) {
        boolean f = true;
        for (Cell it : cells) {
            for(Character jt : hab) {
                if (((Habitat) it).getHabitatType() != jt) {
                    f = false;
                }
            }
        }
        return f;
    }
    public void addAnimal(int id, StringBuffer name, int r, int c) {
        Animal buffer = null;
        switch (id) {
            case 1:
                buffer = new Deer(name,r,c);
                break;
            case 2:
                buffer = new Chimpanzee(name,r,c);
                break;
            case 3:
                buffer = new Bear(name,r,c);
                break;
            case 4:
                buffer = new Elephant(name,r,c);
                break;
            case 5:
                buffer = new Zebra(name,r,c);
                break;
            case 6:
                buffer = new Tiger(name,r,c);
                break;
            case 7:
                buffer = new Lion(name,r,c);
                break;
            case 8:
                buffer = new Giraffe(name,r,c);
                break;
            case 9:
                buffer = new Komodo(name,r,c);
                break;
            case 10:
                buffer = new ElectricEel(name,r,c);
                break;
            case 11:
                buffer = new Shark(name,r,c);
                break;
            case 12:
                buffer = new Seal(name,r,c);
                break;
            case 13:
                buffer = new Stingray(name,r,c);
                break;
            case 14:
                buffer = new Jellyfish(name,r,c);
                break;
            case 15:
                buffer = new Octopus(name,r,c);
                break;
            case 16:
                buffer = new Owl(name,r,c);
                break;
            case 17:
                buffer = new Pelican(name,r,c);
                break;
            case 18:
                buffer = new Cockatoo(name,r,c);
                break;
            case 19:
                buffer = new Parrot(name,r,c);
                break;
            case 20:
                buffer = new Eagle(name,r,c);
                break;
            case 21:
                buffer = new Turtle(name,r,c);
                break;
        }
        if(isAnimalCompatible(id) && isHabitatCompatible(buffer.getHabitats())) {
            animals.add(temp);
        }
    }
}
