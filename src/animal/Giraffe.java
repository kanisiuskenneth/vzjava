package animal;

import animal.Animal;
import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Richard on 26-Mar-17.
 */
public class Giraffe extends Animal {
    public Giraffe(StringBuffer name, int row, int col) {
        super(name, 1500, 8, Position.makePos(row, col), 'g');
        food_type = new ArrayList<Integer>();
        habitats = new ArrayList<Character>();
        incompatible = new HashSet<Integer>();
        food_type.add(2);
        habitats.add('l');
        filum = "Chordata";
        kelas = "Mammalia";
        ordo = "Artiodactyla";
        famili = "Giraffidae";
        genus = "Giraffa";
        spesies = "camelopardalis";
        incompatible.add(6);
        incompatible.add(7);
        incompatible.add(9);
    }

    public void interact() {
        System.out.println("Huuummm.....\n");
    }
}
