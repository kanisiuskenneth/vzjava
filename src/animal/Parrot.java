package animal;

import animal.Animal;
import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Richard on 26-Mar-17.
 */
public class Parrot extends Animal {
    public Parrot(String name, int row, int col) {
        super(name, 2, 19, Position.makePos(row, col), 'b');
        food_type = new ArrayList<Integer>();
        habitats = new ArrayList<Character>();
        incompatible = new HashSet<Integer>();
        food_type.add(2);
        habitats.add('a');
        filum = "Chordata";
        kelas = "Aves";
        ordo = "Psittaciformes";
        famili = "Psittacoidea";
        genus = "Ara";
        spesies = "ararauna";
        incompatible.add(20);
    }

    public void interact() {
        System.out.println("Squawk, HELLO! Squawk squawk\n");
    }
}
