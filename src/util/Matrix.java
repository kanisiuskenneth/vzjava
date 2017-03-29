// File : Matrix.java

package util;
import cell.Cell;

/**
 * Created by Kanisius Kenneth Halim on 3/19/17.
 */
public class Matrix {
    Cell[][] Data;
    int nrow;
    int ncol;

    /**
     * Class constructor
     * @param row banyaknya baris yang ingin dibentuk
     * @param col banyaknya kolom yang ingin dibentuk
     */
    public Matrix(int row, int col) {
        Data = new Cell[row][col];
        nrow = row;
        ncol = col;
    }

    /**
     * Method untuk mengubah isi dari Matrix dengan koordinat dan data yang diberikan
     * I.S. : Matrix terdefinisi
     * F.S. : Matrix dengan koordinat yang diberikan datanya sudah diubah
     * @param i baris dalam Matrix yang datanya ingin diubah/diatur
     * @param j kolom dalam Matrix yang datanya ingin diubah/diatur
     * @param data nilai data yang ingin dimasukkan ke dalam Matrix
     */
    public void setData(int i, int j, Cell data) {
        Data[i][j]=data;
    }

    /**
     * Method untuk mendapatkan data
     * @param i baris dari Matrix yang ingin diambil datanya
     * @param j kolom dari Matrix yang ingin diambil datanya
     * @return Cell dari koordinat yang diberikan
     */
    public Cell getData(int i,int j) {
        return Data[i][j];
    }
}
