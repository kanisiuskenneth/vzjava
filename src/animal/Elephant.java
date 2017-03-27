package animal;

import animal.Animal;
import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Richard on 26-Mar-17.
 */
public class Elephant extends Animal {
    public Elephant(StringBuffer name, int row, int col) {
        super (name, 5200, 4, Position.makePos(row, col), 's');
        food_type = new ArrayList<Integer>();
        habitats = new ArrayList<Character>();
        incompatible = new HashSet<Integer>();
        food_type.add(2);
        habitats.add('l');
        filum = "Chordata";
        kelas = "Mammalia";
        ordo = "Proboscidea";
        famili = "Elephantidae";
        genus = "Elephas";
        spesies = "maximus";
        incompatible.add(6);
        incompatible.add(7);
        incompatible.add(9);
    }

    public void interact() {
        System.out.println("eROOWRRHhh!\n");
    }
}
