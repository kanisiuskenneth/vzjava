package animal;

import animal.Animal;
import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Richard on 26-Mar-17.
 */
public class Cockatoo extends Animal {
    public Cockatoo(StringBuffer name, int row, int col) {
        super (name, 2, 18, Position.makePos(row,col), 'c');
        food_type = new ArrayList<Integer>();
        habitats = new ArrayList<Character>();
        incompatible = new HashSet<Integer>();
        food_type.add(2);
        habitats.add('a');
        filum = "Chordata";
        kelas = "Aves";
        ordo = "Psittaciformes";
        famili = "Cacatuidae";
        genus = "Cacatua";
        spesies = "sulphurea";
        incompatible.add(20);
    }

    public void interact() {
        System.out.println("Chirp chirp\n");
    }
}

