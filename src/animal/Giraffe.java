// File : Giraffe.java

package animal;

import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Daniel Christian on 26-Mar-17.
 */

/**
 * Class Giraffe adalah turunan dari class Animal
 */
public class Giraffe extends Animal {
  /**
   * Class constructor.
   * @param name nama dari Giraffe yang dibentuk
   * @param row baris dalam map, tempat Giraffe akan diposisikan
   * @param col kolom dalam map, tempat Giraffe akan diposisikan
   */
  public Giraffe(StringBuffer name, int row, int col) {
    super(name, 1500, 8, Position.makePos(row, col), 'g');
    food_type = new ArrayList<Integer>();
    habitats = new ArrayList<Character>();
    incompatible = new HashSet<Integer>();
    food_type.add(2);
    habitats.add('l');
    filum = "Chordata";
    kelas = "Mammalia";
    ordo = "Artiodactyla";
    famili = "Giraffidae";
    genus = "Giraffa";
    spesies = "camelopardalis";
    incompatible.add(6);
    incompatible.add(7);
    incompatible.add(9);
    sound = "Huuummm.....";
  }

  /**
   * Method untuk mendapatkan suara interaksi dengan Giraffe
   * @return String sound dari Giraffe
   */
  public String interact() {
    return sound;
  }
}
