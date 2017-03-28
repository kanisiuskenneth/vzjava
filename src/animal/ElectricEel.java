package animal;

import animal.Animal;
import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Richard on 26-Mar-17.
 */
public class ElectricEel extends Animal {
    public ElectricEel(StringBuffer name, int row, int col) {
        super (name, 1, 10, Position.makePos(row, col), '~');
        food_type = new ArrayList<Integer>();
        habitats = new ArrayList<Character>();
        incompatible = new HashSet<Integer>();
        food_type.add(2);
        habitats.add('w');
        filum = "Chordata";
        kelas = "Actinopterygii";
        ordo = "Gymnotiformes";
        famili = "Electrophoridae";
        genus = "Electrophorus";
        spesies = "electricus";
        for (int i = 11; i < 16; i++) {
            incompatible.add(i);
        }
        incompatible.add(21);
        sound = "blurrbb.. swoosh";
    }
    public String interact() {
        return sound;
    }
}
