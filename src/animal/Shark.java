// File : Shark.java

package animal;

import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Daniel Christian on 26-Mar-17.
 */

/**
 * Class Shark adalah turunan dari class Animal
 */
public class Shark extends Animal {
    /**
     * Class constructor.
     * @param name nama dari Shark yang akan dibentuk
     * @param row baris dalam map, tempat Shark diposisikan
     * @param col kolom dalam map, tempat Shark diposisikan
     */
    public Shark(StringBuffer name, int row, int col) {
        super(name, 1000, 11, Position.makePos(row, col), '^');
        food_type = new ArrayList<Integer>();
        habitats = new ArrayList<Character>();
        incompatible = new HashSet<Integer>();
        food_type.add(1);
        habitats.add('w');
        filum = "Chordata";
        kelas = "Chondrichtyes";
        ordo = "Lamniformes";
        famili = "Lamnidae";
        genus = "Carchardon";
        spesies = "carcharias";
        for (int i = 10; i < 16; i++) {
            if (i != 11) {
                incompatible.add(i);
            }
        }
        incompatible.add(21);
        sound = "Shooosshhh .....";
    }

    /**
     * Method untuk mendapatkan suara interaksi dengan Shark
     * @return String sound dari Shark
     */
    public String interact() {
        return sound;
    }
}
