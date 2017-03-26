
package util;
import cell.Cell;

/**
 * Created by ken on 3/19/17.
 */
public class Matrix {
    Cell[][] Data;
    int nrow;
    int ncol;

    public Matrix(int row, int col) {
        Data = new Cell[row][col];
        nrow = row;
        ncol = col;
    }

    public void setData(int i, int j, Cell data) {
        Data[i][j]=data;
    }

    public Cell getData(int i,int j) {
        return Data[i][j];
    }
}
