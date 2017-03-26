package animal;

import animal.Animal;
import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Richard on 26-Mar-17.
 */
public class Owl extends Animal {
    public Owl(String name, int row, int col) {
        super(name, 2, 16, Position.makePos(row, col), 'y');
        food_type = new ArrayList<Integer>();
        habitats = new ArrayList<Character>();
        incompatible = new HashSet<Integer>();
        food_type.add(1);
        habitats.add('a');
        filum = "Chordata";
        kelas = "Aves";
        ordo = "Strigidae";
        genus = "Tyto";
        spesies = "alba";
        incompatible.add(20);
    }

    public void interact() {
        System.out.println("Hoot hoot hoot\n");
    }
}
