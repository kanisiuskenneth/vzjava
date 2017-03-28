// File : Chimpanzee.java

package animal;

import util.Position;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Ferdinandus Richard on 26-Mar-17.
 */

/**
 * Class Chimpanzee adalah turunan dari class Animal
 */
public class Chimpanzee extends Animal {
  /**
   * Class constructor.
   * @param name nama dari Chimpanzee yang dibentuk
   * @param row baris dalam map, tempat Chimpanzee akan diposisikan
   * @param col kolom dalam map, tempat Chimpanzee akan diposisikan
   */
  public Chimpanzee(StringBuffer name, int row, int col) {
    super(name, 60, 2, Position.makePos(row,col), '&');
    food_type = new ArrayList<Integer>();
    habitats = new ArrayList<Character>();
    incompatible = new HashSet<Integer>();
    food_type.add(2);
    habitats.add('l');
    filum = "Chordata";
    kelas = "Mammalia";
    ordo = "Primates";
    famili = "Hominidae";
    genus = "Pan";
    spesies = "troglodytes";
    incompatible.add(6);
    incompatible.add(7);
    incompatible.add(9);
    sound = "Ook oook !";
  }

  /**
   * Method untuk mendapatkan suara interaksi dengan Chimpanzee
   * @return String suara dari Chimpanzee
   */
  public String interact() {
    return sound;
  }
}
