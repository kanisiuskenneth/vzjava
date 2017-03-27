package animal;

import animal.Animal;
import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Richard on 26-Mar-17.
 */
public class Bear extends Animal {
    public Bear(StringBuffer name, int row, int col) {
        super(name, 120,3,Position.makePos(row,col),'@' );
        food_type = new ArrayList<Integer>();
        habitats = new ArrayList<Character>();
        incompatible = new HashSet<Integer>();
        food_type.add(1);
        food_type.add(2);
        habitats.add('l');
        filum = "Chordata";
        kelas = "Mammalia";
        ordo = "Carnivora";
        famili = "Ursidae";
        genus = "Helarctos";
        spesies = "malayanus";
        incompatible.add(6);
        incompatible.add(7);
        incompatible.add(9);
    }
    public void interact() {
        System.out.println("GROOWL!!\n");
    }
}
