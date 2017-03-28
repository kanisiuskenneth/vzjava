package animal;

import animal.Animal;
import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Richard on 26-Mar-17.
 */
public class Octopus extends Animal {
    public Octopus(StringBuffer name, int row, int col) {
        super(name, 15, 15, Position.makePos(row, col), 'o');
        food_type = new ArrayList<Integer>();
        habitats = new ArrayList<Character>();
        incompatible = new HashSet<Integer>();
        food_type.add(1);
        habitats.add('w');
        filum = "Mollusca";
        kelas = "Cephalopoda";
        ordo = "Octopoda";
        famili = "Octopodidae";
        genus = "Octopus";
        spesies = "vulgaris";
        for (int i = 10; i < 14; i++) {
            incompatible.add(i);
        }
        incompatible.add(21);
        sound ="Phoo ahhh";
    }
    public String interact() {
        return sound;
    }
}
