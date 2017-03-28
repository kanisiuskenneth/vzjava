// File : ElectricEel.java

package animal;

import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Daniel Christian on 26-Mar-17.
 */

/**
 * Class ElectricEel adalah turunan dari class Animal
 */
public class ElectricEel extends Animal {
  /**
   * Class constructor.
   * @param name nama dari ElectricEel yang dibentuk
   * @param row baris dalam map, tempat ElectricEel diposisikan
   * @param col kolom dalam map, tempat ElectricEel diposisikan
   */
  public ElectricEel(StringBuffer name, int row, int col) {
    super (name, 1, 10, Position.makePos(row, col), '~');
    food_type = new ArrayList<Integer>();
    habitats = new ArrayList<Character>();
    incompatible = new HashSet<Integer>();
    food_type.add(2);
    habitats.add('w');
    filum = "Chordata";
    kelas = "Actinopterygii";
    ordo = "Gymnotiformes";
    famili = "Electrophoridae";
    genus = "Electrophorus";
    spesies = "electricus";
    for (int i = 11; i < 16; i++) {
      incompatible.add(i);
    }
    incompatible.add(21);
    sound = "blurrbb.. swoosh";
  }

  /**
   * Method untuk mendapatkan suara interaksi dengan ElectricEel
   * @return String sound dari ElectricEel
   */
  public String interact() {
    return sound;
  }
}
