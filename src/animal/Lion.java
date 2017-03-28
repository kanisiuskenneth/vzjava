// File : Lion.java

package animal;

import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Daniel Christian on 26-Mar-17.
 */

/**
 * Class Lion adalah turunan dari class Animal
 */
public class Lion extends Animal {
    /**
     * Class constructor.
     * @param name nama dari Lion yang dibentuk
     * @param row baris dalam map, tempat Lion diposisikan
     * @param col kolom dalam map, tempat Lion diposisikan
     */
    public Lion(StringBuffer name, int row, int col) {
        super(name, 350, 7, Position.makePos(row, col), '!');
        food_type = new ArrayList<Integer>();
        habitats = new ArrayList<Character>();
        incompatible = new HashSet<Integer>();
        food_type.add(1);
        habitats.add('l');
        filum = "Chordata";
        kelas = "Mammalia";
        ordo = "Carnivora";
        famili = "Felidae";
        genus = "Panthera";
        spesies = "leo";
        for (int i = 1; i < 10; i++) {
            if (i != 7) {
                incompatible.add(i);
            }
        }
        incompatible.add(21);
        sound = "Rooaar";
    }

    /**
     * Method untuk mendapatkan suara interaksi dengan Lion
     * @return String sound dari Lion
     */
    public String interact() {
        return sound;
    }
}
