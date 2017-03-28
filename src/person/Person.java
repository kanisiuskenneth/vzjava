// File : Person.java

package person;

import util.Position;

/**
 * Created by Irene Edria on 3/26/17.
 */

/**
 * Class Person
 */
public class Person {
  private StringBuffer name;
  private char symbol;
  private Position position;

  /**
   * Class constructor
   * @param alias nama dari Person yang akan dibuat
   * @param pos posisi awal dari Person yang akan dibuat
   */
  public Person(StringBuffer alias, Position pos) {
    name = alias;
    position = pos;
    symbol = 'P';
  }

  /**
   * Method untuk mendapatkan posisi dari person sekarang
   * @return posisi dari person
   */
  public Position getPosition() {
    return position;
  }

  /**
   * Method agar Person dapat bergerak ke atas
   * I.S. : Person terdefinisi
   * F.S. : Person sudah bergerak ke atas dengan row berkurang 1
   */
  public void moveUp() {
    position.row--;
  }

  /**
   * Method agar Person dapat bergerak ke bawah
   * I.S. : Person terdefinisi
   * F.S. : Person sudah bergerak ke bawah dengan row bertambah 1
   */
  public void moveDown() {
    position.row++;
  }

  /**
   * Method agar Person dapat bergerak ke kiri
   * I.S. : Person terdefinisi
   * F.S. : Person sudah bergerak ke kiri dengan col berkurang 1
   */
  public void moveLeft() {
    position.col--;
  }

  /**
   * Method agar Person dapat bergerak ke kanan
   * I.S. : Person terdefinisi
   * F.S. : Person sudah bergerak ke kanan dengan col bertambah 1
   */
  public void moveRight() {
    position.col++;
  }

  /**
   * Method untuk mengembalikan karakter dari Person
   * @return karakter/symbol dari Person
   */
  public char render() {
    return symbol;
  }
}
