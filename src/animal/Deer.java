// File : Deer.java

package animal;

import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Ferdinandus Richard on 26-Mar-17.
 */

/**
 * Class Deer adalah turunan dari class Animal
 */
public class Deer extends Animal {
    /**
     * Class constructor.
     * @param name nama dari Deer yang dibentuk
     * @param row baris dalam map, tempat Deer akan diposisikan
     * @param col kolom dalam map, tempat Deer akan diposisikan
     */
    public Deer(StringBuffer name, int row, int col) {
        super (name, 50, 1, Position.makePos(row, col), 'v');
        food_type = new ArrayList<Integer>();
        habitats = new ArrayList<Character>();
        incompatible = new HashSet<Integer>();
        food_type.add(2);
        habitats.add('l');
        filum = "Chordata";
        kelas = "Mammalia";
        ordo = "Artiodactyla";
        famili = "Cervidae";
        genus = "Rusa";
        spesies = "timorensis";
        incompatible.add(6);
        incompatible.add(7);
        incompatible.add(9);
        sound = "Meee...eeek";
    }

    /**
     * Method untuk mendapatkan suara interaksi dengan Deer
     * @return String suara dari Deer
     */
    public String interact() {
        return sound;
    }
}
