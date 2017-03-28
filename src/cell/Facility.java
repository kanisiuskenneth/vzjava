package cell;

/**
 * Created by Irene Edria on 3/26/17.
 */

/**
 * Abstract Class Facility yang merupakan inheritance dari Cell
 * Menciptakan Facility beserta atributnya
 */
public class Facility extends Cell {
  /**
   * Class constructor.
   * @param c simbol dari Facility
   */
  public Facility(char c) {
    super(c, true, false);
  }
}
