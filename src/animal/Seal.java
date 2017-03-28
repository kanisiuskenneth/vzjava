// File : Seal.java

package animal;

import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Daniel Christian on 26-Mar-17.
 */

/**
 * Class Seal adalah turunan dari class Animal
 */
public class Seal extends Animal {
    /**
     * Class constructor.
     * @param name nama dari Seal yang dibentuk
     * @param row baris dalam map, tempat Seal diposisikan
     * @param col kolom dalam map, tempat Seal diposisikan
     */
    public Seal(StringBuffer name, int row, int col) {
        super(name, 30, 12, Position.makePos(row, col), '=');
        food_type = new ArrayList<Integer>();
        habitats = new ArrayList<Character>();
        incompatible = new HashSet<Integer>();
        food_type.add(1);
        habitats.add('w');
        filum = "Chordata";
        kelas = "Mammalia";
        ordo = "Pinnipedia";
        famili = "Phocidae";
        genus = "Phoca";
        spesies = "vitulina";
        for (int i = 10; i < 16; i++) {
            if ((i != 12) && (i != 14)) {
                incompatible.add(i);
            }
        }
        sound = "Woonk, woonkk!";
    }

    /**
     * Method untuk mendapatkan suara interaksi dengan Seal
     * @return String suara dari Seal
     */
    public String interact() {
        return sound;
    }
}
