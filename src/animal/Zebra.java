// File : Zebra.java

package animal;

import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Daniel Christian on 26-Mar-17.
 */
public class Zebra extends Animal {
  /**
   * Class constructor.
   * @param name nama dari Zebra yang dibentuk
   * @param row baris dalam map, tempat Zebra diposisikan
   * @param col kolom dalam map, tempat Zebra diposisikan
   */
  public Zebra(StringBuffer name, int row, int col) {
    super(name, 200, 5, Position.makePos(row, col), 'z');
    food_type = new ArrayList<Integer>();
    habitats = new ArrayList<Character>();
    incompatible = new HashSet<Integer>();
    food_type.add(2);
    habitats.add('l');
    filum = "Chordata";
    kelas = "Mammalia";
    ordo = "Perissodactyla";
    famili = "Equidae";
    genus = "Equus";
    spesies = "zebra";
    incompatible.add(6);
    incompatible.add(7);
    incompatible.add(9);
    sound = "Hugh! Hough, hough!";
  }

  /**
   * Method untuk mendapatkan suara interaksi dengan Zebra
   * @return String sound dari Zebra
   */
  public String interact() {
    return sound;
  }
}
