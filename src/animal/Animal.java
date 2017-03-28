// File : Animal.java

package animal;

import java.util.Set;
import java.util.List;
import util.Position;
import util.Renderable;

/**
 * Created by Ferdinandus Richard on 26-Mar-17.
 */

/**
 * Abstract class Animal yang mengimplementasikan kelas interface renderable
 * Menciptakan Animal beserta atributnya
 */
public abstract class Animal implements Renderable {
    private StringBuffer name;
    private int weight;
    private int id;
    private Position position;
    private char symbol;
    protected String sound;
    protected List<Integer> food_type;
    protected List<Character> habitats;
    protected Set<Integer> incompatible;
    protected String filum;
    protected String kelas;
    protected String ordo;
    protected String famili;
    protected String genus;
    protected String spesies;

    /**
     * Class constructor.
     * @param animal_name nama dari Animal yang akan dibuat
     * @param animal_weight berat dari Animal yang akan dibuat
     * @param identifier ID dari Animal yang diasosiasikan dengan tipe Animal yang dibuat
     * @param pos posisi Animal yang akan dibentuk
     * @param sym simbol Animal yang akan dibentuk
     */
    public Animal(StringBuffer animal_name, int animal_weight, int identifier, Position pos, char sym) {
        name = animal_name;
        weight = animal_weight;
        id = identifier;
        position = pos;
        symbol = sym;
    }

    /**
     * Method untuk mendapatkan weight dari Animal
     * @return weight dari Animal
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Method untuk mendapatkan ID (identifier) dari Animal
     * @return ID dari Animal
     */
    public int getId() {
        return id;
    }

    /**
     * Method Animal untuk bergerak ke atas dalam map
     */
    public void moveUp() {
        position.row--;
    }

    /**
     * Method dari Animal untuk bergerak ke bawah dalam map
     */
    public void moveDown() {
        position.row++;
    }

    /**
     * Method dari Animal untuk bergerak ke kiri dalam map
     */
    public void moveLeft() {
        position.col--;
    }

    /**
     * Method dari Animal untuk bergerak ke kanan dalam map
     */
    public void moveRight() {
        position.col++;
    }

    /**
     * Method render mengimplementasikan kelas Renderable
     * Method ini berfungsi untuk mendapatkan simbol dari Animal
     * @return char yang menandakan Animal tersebut
     */
    public char render() {
        return symbol;
    }

    /**
     * Method dari Animal untuk mendapatkan Position dari Animal
     * @return Position dari Animal yang sudah dibentuk
     */
    public Position getPosition() {
        return position;
    }

    /**
     * Method mengambil set yang diambil adalah set yang berisi Animal yang tidak cocok dengan dirinya
     * @return Set of Incompatible
     */
    public Set<Integer> getIncompatible() {
        return incompatible;
    }

    /**
     * Method mengambil list dari habitat yang dapat ditinggali Animal
     * @return List of Habitat
     */
    public List<Character> getHabitats() {
        return habitats;
    }

    /**
     * Method dari Animal untuk mendapatkan nama dari Animal
     * @return String yang merupakan nama dari Animal
     */
    public StringBuffer getName() {
        return name;
    }

    /**
     * Method abstrak yang menghasilkan suara dari Animal
     * @return String suara dari Animal
     */
    public abstract String interact();
}