package animal;

import animal.Animal;
import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Richard on 26-Mar-17.
 */
public class Stingray extends Animal {
    public Stingray(StringBuffer name, int row, int col) {
        super(name, 150, 13, Position.makePos(row, col),'\\');
        food_type = new ArrayList<Integer>();
        habitats = new ArrayList<Character>();
        incompatible = new HashSet<Integer>();
        food_type.add(1);
        habitats.add('w');
        filum = "Chordata";
        kelas  = "Chondrichthyes";
        ordo = "Myliobatiformes";
        famili = "Dasyatidae";
        genus = "Dasyatis";
        spesies = "pastinaca";
        for (int i = 10; i < 16; i++) {
            if (i != 13) {
                incompatible.add(i);
            }
        }
        incompatible.add(21);
        sound = "Bluurrrbb blurrb";
    }
    public String interact() {
        return sound;
    }
}
