// File : Tiger.java

package animal;

import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Daniel Christian on 26-Mar-17.
 */

/**
 * Class Tiger adalah turunan dari class Animal
 */
public class Tiger extends Animal {
    /**
     * Class constructor.
     * @param name nama dari Tiger yang dibentuk
     * @param row baris dalam map, tempat Tiger diposisikan
     * @param col kolom dalam map, tempat Tiger diposisikan
     */
    public Tiger(StringBuffer name, int row, int col) {
        super(name, 150, 6, Position.makePos(row, col), 't');
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
        spesies = "tigris";
        for (int i = 1; i < 10; i++) {
            if (i != 6) {
                incompatible.add(i);
            }
        }
        incompatible.add(21);
        sound = "Groowwlll";
    }

    /**
     * Method untuk mendapatkan suara interaksi dengan Tiger
     * @return String sound dari Tiger
     */
    public String interact() {
        return sound;
    }
}

