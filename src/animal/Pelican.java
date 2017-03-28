package animal;

import animal.Animal;
import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Richard on 26-Mar-17.
 */
public class Pelican extends Animal {
    public Pelican(StringBuffer name, int row, int col) {
        super(name, 3, 17, Position.makePos(row, col), ';');
        food_type = new ArrayList<Integer>();
        habitats = new ArrayList<Character>();
        incompatible = new HashSet<Integer>();
        food_type.add(1);
        habitats.add('a');
        filum = "Chordata";
        kelas = "Aves";
        ordo = "Pelecaniformes";
        famili = "Pelecanidae";
        genus = "Pelecanus";
        spesies = "onocrotalus";
        incompatible.add(20);
        sound = "Heeenkk heeeenk";
    }
    public String interact() {
        return sound;
    }
}
