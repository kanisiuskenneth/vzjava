// File : Pelican.java

package animal;

import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Daniel Christian on 26-Mar-17.
 */

/**
 * Class Pelican adalah turunan dari class Animal
 */
public class Pelican extends Animal {
  /**
   * Class constructor.
   * @param name nama dari Pelican yang dibentuk
   * @param row baris dalam map, tempat Pelican diposisikan
   * @param col kolom dalam map, tempat Pelican diposisikan
   */
  public Pelican(StringBuffer name, int row, int col) {
    super(name, 3, 17, Position.makePos(row, col), ';');
    food_type = new ArrayList<Integer>();
    habitats = new ArrayList<Character>();
    incompatible = new HashSet<Integer>();
    food_type.add(1);
    habitats.add('a');
    filum = "Chordata";
    kelas = "Aves";
    ordo = "Pelecaniformes";
    famili = "Pelecanidae";
    genus = "Pelecanus";
    spesies = "onocrotalus";
    incompatible.add(20);
    sound = "Heeenkk heeeenk";
  }

  /**
   * Method untuk mendapatkan suara interaksi dengan Pelican
   * @return String sound dari Pelican
   */
  public String interact() {
    return sound;
  }
}
