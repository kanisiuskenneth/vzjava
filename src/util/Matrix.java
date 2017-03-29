// File : Matrix.java

package util;
import cell.Cell;

/**
 * Created by Kanisius Kenneth Halim on 3/19/17.
 */

/**
 * Class Matrix of Cell
 */
public class Matrix {
  private final Cell[][] Data;
  private final int nrow;
  private final int ncol;

  /**
   * Class constructor
   * @param row banyaknya baris yang akan dibentuk sebagai matrix
   * @param col banyaknya kolom yang akan dibentuk sebagai matrix
   */
  public Matrix(int row, int col) {
    Data = new Cell[row][col];
    nrow = row;
    ncol = col;
  }

  /**
   * Setter data dalam matrix
   * I.S. : Matrix terdefinisi
   * F.S. : Komponen matrix(i,j) sudah diubah datanya dengan data
   * @param i baris dalam matrix yang komponennya ingin diubah
   * @param j kolom dalam matrix yang komponennya ingin diubah
   * @param data nilai data yang akan dimasukkan ke dalam matrix
   */
  public void setData(int i, int j, Cell data) {
    Data[i][j]=data;
  }

  /**
   * Getter data dalam matrix
   * @param i baris dalam matrix yang komponennya ingin diambil
   * @param j kolom dalam matrix yang komponennya ingin diambil
   * @return cell yang berasosiasi dengan koordinatnya dalam matrix
   */
  public Cell getData(int i,int j) {
    return Data[i][j];
  }

  public int getRow() {
    return nrow;
  }
  public int getCol() {
    return ncol;
  }
}
