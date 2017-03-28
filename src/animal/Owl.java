// File : Owl.java

package animal;

import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Daniel Christian on 26-Mar-17.
 */

/**
 * Class Owl adalah turunan dari class Animal
 */
public class Owl extends Animal {
    /**
     * Class constructor.
     * @param name nama dari Owl yang dibentuk
     * @param row baris dalam map, tempat Owl diposisikan
     * @param col kolom dalam map, tempat Owl diposisikan
     */
    public Owl(StringBuffer name, int row, int col) {
        super(name, 2, 16, Position.makePos(row, col), 'y');
        food_type = new ArrayList<Integer>();
        habitats = new ArrayList<Character>();
        incompatible = new HashSet<Integer>();
        food_type.add(1);
        habitats.add('a');
        filum = "Chordata";
        kelas = "Aves";
        ordo = "Strigidae";
        genus = "Tyto";
        spesies = "alba";
        incompatible.add(20);
        sound = "Hoot hoot hoot";
    }

    /**
     * Method untuk mendapatkan suara interaksi dengan Owl
     * @return String sound dari Owl
     */
    public String interact() {
        return sound;
    }
}
