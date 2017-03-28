package animal;

import animal.Animal;
import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Richard on 26-Mar-17.
 */
public class Chimpanzee extends Animal {
    public Chimpanzee(StringBuffer name, int row, int col) {
        super(name, 60, 2, Position.makePos(row,col), '&');
        food_type = new ArrayList<Integer>();
        habitats = new ArrayList<Character>();
        incompatible = new HashSet<Integer>();
        food_type.add(2);
        habitats.add('l');
        filum = "Chordata";
        kelas = "Mammalia";
        ordo = "Primates";
        famili = "Hominidae";
        genus = "Pan";
        spesies = "troglodytes";
        incompatible.add(6);
        incompatible.add(7);
        incompatible.add(9);
        sound = "Ook oook !";
    }
    public String interact() {
        return sound;
    }
}
