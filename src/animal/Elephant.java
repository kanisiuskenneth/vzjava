// File : Elephant.java

package animal;

import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Daniel Christian on 26-Mar-17.
 */

/**
 * Class Elephant adalah turunan dari class Animal
 */
public class Elephant extends Animal {
    /**
     * Class constructor.
     * @param name nama dari Elephant yang dibentuk
     * @param row baris dalam map, tempat Elephant diposisikan
     * @param col kolom dalam map, tempat Elephant diposisikan
     */
    public Elephant(StringBuffer name, int row, int col) {
        super (name, 5200, 4, Position.makePos(row, col), 's');
        food_type = new ArrayList<Integer>();
        habitats = new ArrayList<Character>();
        incompatible = new HashSet<Integer>();
        food_type.add(2);
        habitats.add('l');
        filum = "Chordata";
        kelas = "Mammalia";
        ordo = "Proboscidea";
        famili = "Elephantidae";
        genus = "Elephas";
        spesies = "maximus";
        incompatible.add(6);
        incompatible.add(7);
        incompatible.add(9);
        sound = "eROOWRRHhh!";
    }

    /**
     * Method untuk mendapatkan suara interaksi dengan Elephant
     * @return String sound dari Elephant
     */
    public String interact() {
        return sound;
    }
}
