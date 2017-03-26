package animal;

import java.util.Set;
import java.util.List;
import util.Position;
import util.Renderable;

/**
 * Created by Richard on 26-Mar-17.
 */
public abstract class Animal implements Renderable {
    private String name;
    private int weight;
    private int id;
    private Position position;
    private char symbol;
    protected List<Integer> food_type;
    protected List<Character> habitats;
    protected Set<Integer> incompatible;
    protected String filum;
    protected String kelas;
    protected String ordo;
    protected String famili;
    protected String genus;
    protected String spesies;

    public Animal(String animal_name, int animal_weight, int identifier, Position pos, char sym) {
        name = animal_name;
        weight = animal_weight;
        id = identifier;
        position = pos;
        symbol = sym;
    }

    public int getWeight() {
        return weight;
    }

    public int getId() {
        return id;
    }

    public void moveUp() {
        position.row--;
    }

    public void moveDown() {
        position.row++;
    }

    public void moveLeft() {
        position.col--;
    }

    public void moveRight() {
        position.col++;
    }

    public char render() {
        return symbol;
    }

    public Position getPosition() {
        return position;
    }

    public Set<Integer> getIncompatible() {
        return incompatible;
    }

    public List<Character> getHabitats() {
        return habitats;
    }

    public String getName() {
        return name;
    }
}