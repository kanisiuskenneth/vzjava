package animal;

import animal.Animal;
import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Richard on 26-Mar-17.
 */
public class Eagle extends Animal {
    public Eagle(StringBuffer name, int row, int col) {
        super(name, 22, 20, Position.makePos(row, col), 'q');
        food_type = new ArrayList<Integer>();
        habitats = new ArrayList<Character>();
        incompatible = new HashSet<Integer>();
        food_type.add(1);
        habitats.add('a');
        filum = "Chordata";
        kelas = "Aves";
        ordo = "Accipitriformes";
        famili = "Accipitridae";
        genus = "Spizaetus";
        spesies = "cirrhatus";
        for (int i = 16; i < 20; i++) {
            incompatible.add(i);
        }
        sound = "Phweee !!";
    }
    public String interact() {
        return sound;
    }
}
