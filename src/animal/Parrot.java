// File : Parrot.java

package animal;

import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Daniel Christian on 26-Mar-17.
 */

/**
 * Class Parrot adalah turunan dari class Animal
 */
public class Parrot extends Animal {
  /**
   * Class constructor.
   * @param name nama dari Parrot yang dibentuk
   * @param row baris dalam map, tempat Parrot diposisikan
   * @param col kolom dalam map, tempat Parrot diposisikan
   */
  public Parrot(StringBuffer name, int row, int col) {
    super(name, 2, 19, Position.makePos(row, col), 'b');
    food_type = new ArrayList<Integer>();
    habitats = new ArrayList<Character>();
    incompatible = new HashSet<Integer>();
    food_type.add(2);
    habitats.add('a');
    filum = "Chordata";
    kelas = "Aves";
    ordo = "Psittaciformes";
    famili = "Psittacoidea";
    genus = "Ara";
    spesies = "ararauna";
    incompatible.add(20);
    sound = "Squawk, HELLO! Squawk squawk";
  }

  /**
   * Method untuk mendapatkan suara interaski dengan Parrot
   * @return String sound dari Parrot
   */
  public String interact() {
    return sound;
  }
}
