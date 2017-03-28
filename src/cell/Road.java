// File : Road.java

package cell;

/**
 * Created by Irene Edria on 3/26/17.
 */

/**
 * Real Class Road yang merupakan inheritance dari Facility
 * Menciptakan Road dan atributnya
 */
public class Road extends Facility {
  /**
   * Class constructor.
   * Menciptakan Road
   */
  public Road() {
    super('.');
  }

  /**
   * Class construcor dengan paramter
   * @param sym simbol dari road
   */
  public Road(char sym) {
    super(sym);
  }
}
