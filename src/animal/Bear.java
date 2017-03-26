package animal;

import animal.Animal;
import util.Position;

/**
 * Created by Richard on 26-Mar-17.
 */
public class Bear extends Animal {
    public Bear(String name, int row, int col) {
        super(name, 25,3,'@' );
        food_type = new ArrayList<int>();
        habitats = new ArrayList<int>();
        incompatible = new HashSet();
        food_type.add(1);
        food_type.add(2);
        habitats.add(2);
        filum = "Chordata";
        kelas = "Mammalia";
        ordo = "Carnivora";
        famili = "Ursidae";
        genus = "Helarctos";
        spesies = "malayanus";
        incompatible = {}
    }
}
