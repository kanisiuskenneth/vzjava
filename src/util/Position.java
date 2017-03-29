// File : Position.java

package util;

/**
 * Created by Kanisius Kenneth Halim on 3/26/17.
 */

/**
 * Class Position hanya berfungsi sebagai struktur data
 */
public class Position {
  public int row;
  public int col;

  /**
   * Class constructor
   * @param _row baris dalam zoo
   * @param _col kolom dalam zoo
   */
  public Position(int _row, int _col) {
    row = _row;
    col = _col;
  }

  /**
   * Method untuk membentuk tipe bentukan Position di luar class Position
   * @param _row posisi baris
   * @param _col posisi kolom
   * @return posisi yang sudah dibentuk
   */
  public static Position makePos(int _row, int _col) {
    return new Position(_row,_col);
  }
}
