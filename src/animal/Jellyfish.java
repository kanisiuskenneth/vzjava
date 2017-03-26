package animal;

import animal.Animal;
import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Richard on 26-Mar-17.
 */

public class Jellyfish extends Animal {
    public Jellyfish(String name, int row, int col) {
        super(name, 1, 14, Position.makePos(row, col), 'j');
        food_type = new ArrayList<Integer>();
        habitats = new ArrayList<Character>();
        incompatible = new HashSet<Integer>();
        food_type.add(1);
        food_type.add(2);
        habitats.add('w');
        filum = "Cnidaria";
        kelas = "Scyphozoa";
        ordo = "Semaeostomeae";
        famili = "Ulmaridae";
        genus = "Aurelia";
        spesies = "aurita";
        incompatible.add(10);
        incompatible.add(11);
        incompatible.add(13);
    }

    public void interact() {
        System.out.println("Shoo.. shoo...\n");
    }
}
