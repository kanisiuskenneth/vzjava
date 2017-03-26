package animal;

import animal.Animal;
import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Richard on 26-Mar-17.
 */
public class Seal extends Animal {
    public Seal(String name, int row, int col) {
        super(name, 30, 12, Position.makePos(row, col), '=');
        food_type = new ArrayList<Integer>();
        habitats = new ArrayList<Character>();
        incompatible = new HashSet<Integer>();
        food_type.add(1);
        habitats.add('w');
        filum = "Chordata";
        kelas = "Mammalia";
        ordo = "Pinnipedia";
        famili = "Phocidae";
        genus = "Phoca";
        spesies = "vitulina";
        for (int i = 10; i < 16; i++) {
            if ((i != 12) || (i != 14)) {
                incompatible.add(i);
            }
        }
    }

    public void interact() {
        System.out.println("Woonk, woonkk!\n");
    }
}
