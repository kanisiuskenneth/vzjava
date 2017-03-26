package animal;

import java.util.Set;
import java.util.List;

/**
 * Created by Richard on 26-Mar-17.
 */
public abstract class Animal {
    private String name;
    private int weight;
    private int id;
    private Pair<int, int> position;
    private char symbol;
    protected List<int> food_type;
    protected List<char> habitats;
    protected Set<int> incompatible;
    protected String filum;
    protected String kelas;
    protected String ordo;
    protected String famili;
    protected String genus;
    protected String spesies;

    public Animal(String animal_name, int animal_weight, int identifier, Pair<int, int> pos, char sym) {
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
        position.first--;
    }

    public void moveDown() {
        position.first++;
    }

    public void moveLeft() {
        position.second--;
    }

    public void moveRight() {
        position.second++;
    }

    public char Render() {
        return symbol;
    }

    public Pair<int, int> getPosition() {
        return position;
    }

    public Set<int> getIncompatible() {
        return incompatible;
    }

    public List<char> getHabitats() {
        return habitats;
    }

    public String getName() {
        return name;
    }
}