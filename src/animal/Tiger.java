package animal;

import animal.Animal;
import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Richard on 26-Mar-17.
 */
public class Tiger extends Animal {
    public Tiger(StringBuffer name, int row, int col) {
        super(name, 150, 6, Position.makePos(row, col), 't');
        food_type = new ArrayList<Integer>();
        habitats = new ArrayList<Character>();
        incompatible = new HashSet<Integer>();
        food_type.add(1);
        habitats.add('l');
        filum = "Chordata";
        kelas = "Mammalia";
        ordo = "Carnivora";
        famili = "Felidae";
        genus = "Panthera";
        spesies = "tigris";
        for (int i = 1; i < 10; i++) {
            if (i != 6) {
                incompatible.add(i);
            }
        }
        incompatible.add(21);
        sound = "Groowwlll";
    }
    public String interact() {
        return sound;
    }
}

