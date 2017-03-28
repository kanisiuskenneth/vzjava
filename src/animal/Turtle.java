// File : Turtle.java

package animal;

import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Daniel Christian on 26-Mar-17.
 */

/**
 * Class Turtle adalah turunan dari class Animal
 */
public class Turtle extends Animal {
    /**
     * Class constructor.
     * @param name nama dari Turtle yang dibentuk
     * @param row baris dalam map, tempat Turtle diposisikan
     * @param col kolom dalam map, tempat Turtle diposisikan
     */
    public Turtle(StringBuffer name, int row, int col) {
        super(name, 35, 21, Position.makePos(row, col), ':');
        food_type = new ArrayList<Integer>();
        habitats = new ArrayList<Character>();
        incompatible = new HashSet<Integer>();
        food_type.add(2);
        habitats.add('l');
        habitats.add('w');
        filum = "Chordata";
        kelas = "Reptilia";
        ordo = "Testudines";
        famili = "Emydidae";
        genus = "Trachemys";
        spesies = "scripta";
        incompatible.add(6);
        incompatible.add(7);
        incompatible.add(10);
        incompatible.add(11);
        incompatible.add(13);
        incompatible.add(15);
        sound = "Squeeekk";
    }

    /**
     * Method untuk mendapatkan suara interaksi dengan Turtle
     * @return String sound dari Turtle
     */
    public String interact() {
        return sound;
    }
}
