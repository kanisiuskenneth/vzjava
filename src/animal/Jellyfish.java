// File : Jellyfish.java

package animal;

import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Daniel Christian on 26-Mar-17.
 */

/**
 * Class Jellyfish adalah turunan dari class Animal
 */
public class Jellyfish extends Animal {
  /**
   * Class constructor.
   * @param name nama dari Jellyfish yang dibentuk
   * @param row baris dalam map, tempat Jellyfish diposisikan
   * @param col kolom dalam map, tempat Jellyfish diposisikan
   */
  public Jellyfish(StringBuffer name, int row, int col) {
    super(name, 1, 14, Position.makePos(row, col), 'j');
    food_type = new ArrayList<Integer>();
    habitats = new ArrayList<Character>();
    incompatible = new HashSet<Integer>();
    food_type.add(1);
    food_type.add(2);
    habitats.add('w');
    filum = "Cnidaria";
    kelas = "Scyphozoa";
    ordo = "Semaeostomeae";
    famili = "Ulmaridae";
    genus = "Aurelia";
    spesies = "aurita";
    incompatible.add(10);
    incompatible.add(11);
    incompatible.add(13);
    sound = "Shoo.. shoo...";
  }

  /**
   * Method untuk mendapatkan suara interaksi dengan Jellyfish
   * @return String suara dari Jellyfish
   */
  public String interact() {
    return sound;
  }
}
