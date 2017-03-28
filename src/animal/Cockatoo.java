// File : Cockatoo.java

package animal;

import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Ferdinandus Richard on 26-Mar-17.
 */

/**
 * Class Cockatoo adalah turunan dari class Animal
 */
public class Cockatoo extends Animal {
    /**
     * Class constructor.
     * @param name nama dari Cockatoo yang dibentuk
     * @param row baris dalam map, tempat Cockatoo akan diposisikan
     * @param col kolom dalam map, tempat Cockatoo akan diposisikan
     */
    public Cockatoo(StringBuffer name, int row, int col) {
        super (name, 2, 18, Position.makePos(row,col), 'c');
        food_type = new ArrayList<Integer>();
        habitats = new ArrayList<Character>();
        incompatible = new HashSet<Integer>();
        food_type.add(2);
        habitats.add('a');
        filum = "Chordata";
        kelas = "Aves";
        ordo = "Psittaciformes";
        famili = "Cacatuidae";
        genus = "Cacatua";
        spesies = "sulphurea";
        incompatible.add(20);
        sound = "Chirp chirp";
    }

    /**
     * Method untuk mendapatkan suara interaksi dengan Cockatoo
     * @return String suara dari Cockatoo
     */
    public String interact() {
        return sound;
    }
}

