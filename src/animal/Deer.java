package animal;

import animal.Animal;
import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Richard on 26-Mar-17.
 */
public class Deer extends Animal {
    public Deer(String name, int row, int col) {
        super (name, 50, 1, Position.makePos(row, col), 'v');
        food_type = new ArrayList<Integer>();
        habitats = new ArrayList<Character>();
        incompatible = new HashSet<Integer>();
        food_type.add(2);
        habitats.add('l');
        filum = "Chordata";
        kelas = "Mammalia";
        ordo = "Artiodactyla";
        famili = "Cervidae";
        genus = "Rusa";
        spesies = "timorensis";
        incompatible.add(6);
        incompatible.add(7);
        incompatible.add(9);
    }

    public void interact() {
        System.out.println("Meee...eeek\n");
    }
}
