// File: Komodo.java

package animal;

import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Daniel Christian on 26-Mar-17.
 */

/**
 * Class Komodo adalah turunan dari class Animal
 */
public class Komodo extends Animal {
  /**
   * Class constructor.
   * @param name nama dari Komodo yang dibentuk
   * @param row baris dalam map, tempat Komodo diposisikan
   * @param col kolom dalam map, tempat Komodo diposisikan
   */
  public Komodo(StringBuffer name, int row, int col) {
    super (name, 80, 9, Position.makePos(row, col), 'k');
    food_type = new ArrayList<Integer>();
    habitats = new ArrayList<Character>();
    incompatible = new HashSet<Integer>();
    food_type.add(1);
    food_type.add(2);
    habitats.add('l');
    filum = "Chordata";
    kelas = "Reptilia";
    ordo = "Squamata";
    famili = "Varanidae";
    genus = "Varanus";
    spesies = "komodoensis";
    for (int i = 1; i < 9; i++) {
      incompatible.add(i);
    }
    incompatible.add(21);
    sound = "....hiss....";
  }

  /**
   * Method untuk mendapatkan suara interaksi dengan Komodo
   * @return String sound dari Komodo
   */
  public String interact() {
    return sound;
  }
}
