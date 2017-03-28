package animal;

import animal.Animal;
import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Richard on 26-Mar-17.
 */
public class Zebra extends Animal {
    public Zebra(StringBuffer name, int row, int col) {
        super(name, 200, 5, Position.makePos(row, col), 'z');
        food_type = new ArrayList<Integer>();
        habitats = new ArrayList<Character>();
        incompatible = new HashSet<Integer>();
        food_type.add(2);
        habitats.add('l');
        filum = "Chordata";
        kelas = "Mammalia";
        ordo = "Perissodactyla";
        famili = "Equidae";
        genus = "Equus";
        spesies = "zebra";
        incompatible.add(6);
        incompatible.add(7);
        incompatible.add(9);
        sound = "Hugh! Hough, hough!";
    }
    public String interact() {
        return sound;
    }
}
