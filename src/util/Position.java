// File : Position.java

package util;

/**
 * Created by Kanisius Kenneth Halim on 3/26/17.
 */

/**
 * Class Position
 * Class ini hanya berfungsi sebagai struktur data yang menyatakan posisi
 */
public class Position {
    public int row;
    public int col;

    /**
     * Class constructor.
     * @param _row posisi baris
     * @param _col posisi kolom
     */
    public Position(int _row, int _col) {
        row = _row;
        col = _col;
    }

    /**
     * Method agar dapat dibuat posisi tanpa harus membuat posisi terlebih dahulu
     * @param _row posisi baris
     * @param _col posisi kolom
     * @return posisi yang sudah dibentuk
     */
    public static Position makePos(int _row, int _col) {
        Position P = new Position(_row,_col);
        return P;
    }
}
