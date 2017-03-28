// File : Person.java

package person;

import util.Position;

/**
 * Created by Irene Edria on 3/26/17.
 */

/**
 * Class Person menyatakan person di map
 */
public class Person {
  private StringBuffer name;
  private char symbol;
  private Position position;

  /**
   * Class constructor
   * @param alias nama dari person yang dibentuk
   * @param pos posisi awal dalam map dari person yang dibentuk
   */
  public Person(StringBuffer alias, Position pos) {
  name = alias;
  position = pos;
  symbol = 'P';
  }

  /**
   * @return posisi dari Person
   */
  public Position getPosition() {
  return position;
  }

  /**
   * Method person agar bisa bergerak ke atas dalam map
   * I.S. : posisi person terdefinisi
   * F.S. : posisi person berubah dengan row berkurang 1
   */
  public void moveUp() {
  position.row--;
  }

  /**
   * Method person agar bisa bergerak ke bawah dalam map
   * I.S. : posisi person terdefinisi
   * F.S. : posisi person berubah dengan row bertambah 1
   */
  public void moveDown() {
  position.row++;
  }

  /**
   * Method person agar bisa bergerak ke kiri dalam map
   * I.S. : posisi person terdefinisi
   * F.S. : posisi person berubah dengan col berkurang 1
   */
  public void moveLeft() {
  position.col--;
  }

  /**
   * Method person agar bisa bergerak ke kanan dalam map
   * I.S. : posisi person terdefinisi
   * F.S. : posisi person berubah dengan col bertambah 1
   */
  public void moveRight() {
  position.col++;
  }

  /**
   * Melakukan render terhadap person
   * @return symbol dari person dalam map
   */
  public char render() {
  return symbol;
  }
}
