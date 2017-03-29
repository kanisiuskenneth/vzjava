// File : Zoo.java

package zoo;
import java.util.HashSet;
import java.util.Vector;

import animal.Animal;
import util.Matrix;
import cage.Cage;
import cell.Cell;
import util.Position;

/**
 * Created by Kanisius Kenneth Halim on 3/26/17.
 */

public class Zoo {
    private int row;
    private int col;
    public Matrix data;
	public HashSet<Cage> cages = new HashSet<Cage>();
	public Vector<Position> entrances = new Vector<Position>();

    /**
     * Class constuctor.
     * @param _row banyaknya baris dari Zoo yang akan dibentuk
     * @param _col banyaknya kolom dari Zoo yang akan dibentuk
     */
    public Zoo(int _row, int _col) {
      row = _row;
      col = _col;
      data = new Matrix(_row,_col);
    }

    /**
     * Getter col dari Matrix
     * @return banyaknya kolom dari Zoo
     */
    public int getCol() {
      return col;
    }

    /**
     * Getter row dari Matrix
     * @return banyaknya baris dari Zoo
     */
    public int getRow() {
        return row;
    }

    /**
     * Getter Cell di koordinat yang sudah diberikan dari Matrix
     * @param i baris koordinat dalam Matrix yang Cell-nya ingin diambil
     * @param j kolom koordinat dalam Matrix yang Cell-nya ingin diambil
     * @return Cell di koordinat yang diberikan
     */
	public Cell getCell(int i, int j) {
		return data.getData(i,j);
	}

    /**
     * Method untuk mendapatkan jumlah makanan untuk hewan karnivor di Zoo
     * @return jumlah makanan untuk karnivor di Zoo
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
     * Method untuk mendapatkan jumlah makanan untuk hewan herbivor di Zoo
     * @return jumlah makanan untuk herbivor di Zoo
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

