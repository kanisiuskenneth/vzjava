// File : Bear.java

package animal;

import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Ferdinandus Richard on 26-Mar-17.
 */

/**
 * Class Bear adalah turunan dari class Animal.
 */
public class Bear extends Animal {
    /** Class constructor.
     * @param name nama dari Bear
     * @param row baris dalam map, tempat Bear akan diposisikan
     * @param col kolom dalam map, tempat Bear akan diposisikan
     */
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
        sound = "GROOWL!!";
    }

    /**
     * Method untuk mendapatkan suara interaksi dengan Bear
     * @return String suara dari Bear
     */
    public String interact() {
        return sound;
    }
}
