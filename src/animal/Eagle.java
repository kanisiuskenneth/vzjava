// File : Eagle.java

package animal;

import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Ferdinandus Richard on 26-Mar-17.
 */

/**
 * Class Eagle adalah turunan dari class Animal
 */
public class Eagle extends Animal {
  /**
   * Class constructor.
   * @param name nama dari Eagle yang dibentuk
   * @param row baris dalam map, tempat Eagle diposisikan
   * @param col kolom dalam map, tempat Eagle diposisikan
   */
  public Eagle(StringBuffer name, int row, int col) {
    super(name, 22, 20, Position.makePos(row, col), 'q');
    food_type = new ArrayList<Integer>();
    habitats = new ArrayList<Character>();
    incompatible = new HashSet<Integer>();
    food_type.add(1);
    habitats.add('a');
    filum = "Chordata";
    kelas = "Aves";
    ordo = "Accipitriformes";
    famili = "Accipitridae";
    genus = "Spizaetus";
    spesies = "cirrhatus";
    for (int i = 16; i < 20; i++) {
      incompatible.add(i);
    }
    sound = "Phweee !!";
  }

  /**
   * Method untuk mendapatkan suara interaksi dengan Eagle
   * @return String sound dari Eagle
   */
  public String interact() {
    return sound;
  }
}
