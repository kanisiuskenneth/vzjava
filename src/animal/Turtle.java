package animal;

import animal.Animal;
import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Richard on 26-Mar-17.
 */
public class Turtle extends Animal {
    public Turtle(String name, int row, int col) {
        super(name, 35, 21, Position.makePos(row, col), ':');
        food_type = new ArrayList<Integer>();
        habitats = new ArrayList<Character>();
        incompatible = new HashSet<Integer>();
        filum = "Chordata";
        kelas = "Reptilia";
        ordo = "Testudines";
        famili = "Emydidae";
        genus = "Trachemys";
        spesies = "scripta";
        incompatible.add(6);
        incompatible.add(7);
        incompatible.add(10);
        incompatible.add(11);
        incompatible.add(13);
        incompatible.add(15);
    }

    public void interact() {
        System.out.println("Squeeekk\n");
    }
}
