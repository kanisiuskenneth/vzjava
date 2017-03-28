// File : Stingray.java

package animal;

import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Daniel Christian on 26-Mar-17.
 */

/**
 * Class Stingray adalah turunan dari class Animal
 */
public class Stingray extends Animal {
    /**
     * Class constructor.
     * @param name nama dari Stingray yang dibentuk
     * @param row baris dalam map, tempat Stingray diposisikan
     * @param col kolom dalam map, tempat Stingray diposisikan
     */
    public Stingray(StringBuffer name, int row, int col) {
        super(name, 150, 13, Position.makePos(row, col),'\\');
        food_type = new ArrayList<Integer>();
        habitats = new ArrayList<Character>();
        incompatible = new HashSet<Integer>();
        food_type.add(1);
        habitats.add('w');
        filum = "Chordata";
        kelas  = "Chondrichthyes";
        ordo = "Myliobatiformes";
        famili = "Dasyatidae";
        genus = "Dasyatis";
        spesies = "pastinaca";
        for (int i = 10; i < 16; i++) {
            if (i != 13) {
                incompatible.add(i);
            }
        }
        incompatible.add(21);
        sound = "Bluurrrbb blurrb";
    }

    /**
     * Method untuk mendapatkan suara interaksi dengan Stingray
     * @return String sound dari Stingray
     */
    public String interact() {
        return sound;
    }
}
