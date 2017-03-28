package animal;

import animal.Animal;
import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Richard on 26-Mar-17.
 */
public class Shark extends Animal {
    public Shark(StringBuffer name, int row, int col) {
        super(name, 1000, 11, Position.makePos(row, col), '^');
        food_type = new ArrayList<Integer>();
        habitats = new ArrayList<Character>();
        incompatible = new HashSet<Integer>();
        food_type.add(1);
        habitats.add('w');
        filum = "Chordata";
        kelas = "Chondrichtyes";
        ordo = "Lamniformes";
        famili = "Lamnidae";
        genus = "Carchardon";
        spesies = "carcharias";
        for (int i = 10; i < 16; i++) {
            if (i != 11) {
                incompatible.add(i);
            }
        }
        incompatible.add(21);
        sound = "Shooosshhh .....";
    }
    public String interact() {
        return sound;
    }
}
