// File : Zoo.java

package zoo;

import java.util.HashSet;
import java.util.Vector;

import animal.Animal;
import cage.Cage;
import util.Matrix;
import cell.Cell;
import util.Position;

/**
 * Created by Kanisius Kenneth Halim on 3/26/17.
 */

/**
 * Class Zoo
 */
public class Zoo {
    private int row;
    private int col;
    public Matrix data;
    public HashSet<Cage> cages = new HashSet<Cage>();
    public Vector<Position>  entrances = new Vector<Position>();

    /**
     * Class constructor.
     * @param _row banyaknya baris yang ingin dibentuk
     * @param _col banyaknya kolom yang ingin dibentuk
     */
    public Zoo(int _row, int _col) {
        row = _row;
        col = _col;
        data = new Matrix(_row, _col);
    }

    /**
     * @return banyaknya kolom dari Zoo
     */
    public int getCol() {
        return col;
    }

    /**
     * @return banyaknya baru dari Zoo
     */
    public int getRow() {
        return row;
    }

    /**
     * Method untuk mendapatkan Cell di koordinat tertentu
     * @param i baris yang ingin diambil Cellnya
     * @param j kolom yang ingin diambil Cellnya
     * @return Cell dari koordinat yang dimasukkan
     */
    public Cell getCell(int i, int j) {
        return data.getData(i,j);
    }

    /**
     * @return banyaknya porsi makanan karnivora yang dibutuhkan dalam zoo
     */
    public float getFoodPortionCarnivore() {
        float sum =0;
        for(Cage it : cages) {
            for (Animal jt : it.animals) {
                if(jt.getFoodType().contains(1)) {
                    sum += jt.getWeight()*0.1/jt.getFoodType().size();
                }
            }
        }
        return sum;
    }

    /**
     * @return banyaknya porsi makanan herbivora yang dibutuhkan dalam zoo
     */
    public float getFoodPortionHerbivore() {
        float sum =0;
        for(Cage it : cages) {
            for (Animal jt : it.animals) {
                if(jt.getFoodType().contains(2)) {
                    sum += jt.getWeight()*0.1/jt.getFoodType().size();
                }
            }
        }
        return sum;
    }
}
