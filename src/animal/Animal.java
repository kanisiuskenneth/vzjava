package animal;

import java.util.Set;
import java.util.List;
import util.Position;

/**
 * Created by Richard on 26-Mar-17.
 */
public class Animal {
    private String name;
    private int weight;
    private int id;
    private Position position;
    private char symbol;
    private List<Integer> food_type;
    private List<Character> habitats;
    private Set<Integer> incompatible;
    private String filum;
    private String kelas;
    private String ordo;
    private String famili;
    private String genus;
    private String spesies;

    public Animal(String animal_name, int identifier, Position pos) {
        name = animal_name;
        id = identifier;
        position = pos;
        food_type = new ArrayList<Integer>();
        habitats = new ArrayList<Character>();
        incompatible = new HashSet<Integer>();
        switch (identifer) {
            case 1:
                weight = 50;
                symbol = 'v';
                food_type.add(2);
                habitats.add('l');
                filum = "Chordata";
                kelas = "Mammalia";
                ordo = "Artiodactyla";
                famili = "Cervidae";
                genus = "Rusa";
                spesies = "timorensis";
                incompatible.add(6);
                incompatible.add(7);
                incompatible.add(9);
                break;
            case 2:
                weight = 60;
                symbol = '&';
                food_type.add(2);
                habitats.add('l');
                filum = "Chordata";
                kelas = "Mammalia";
                ordo = "Primates";
                famili = "Pan";
                spesies = "troglodytes";
                incompatible.add(6);
                incompatible.add(7);
                incompatible.add(9);
                break;
            case 3:
                weight = 120;
                symbol = '@';
                food_type.add(1);
                food_type.add(2);
                habitats.add('l');
                filum = "Chordata";
                kelas = "Mammalia";
                ordo = "Carnivora";
                famili = "Ursidae";
                genus = "Helarctos";
                spesies = "malayanus";
                incompatible.add(6);
                incompatible.add(7);
                incompatible.add(9);
                break;
            case 4:
                weight = 5200;
                symbol = 's';
                food_type.add(2);
                habitats.add('l');
                filum = "Chordata";
                kelas = "Mammalia";
                ordo = "Proboscidea";
                famili = "Elephantidae";
                genus = "Elephas";
                spesies = "maximus";
                incompatible.add(6);
                incompatible.add(7);
                incompatible.add(9);
                break;
            case 5:
                weight = 200;
                symbol = 'z';
                food_type.add(2);
                habitats.add('l');
                filum = "Chordata";
                kelas = "Mammalia";
                ordo = "Perissodactyla";
                famili = "Equidae";
                genus = "Equus";
                spesies = "zebra";
                incompatible.add(6);
                incompatible.add(7);
                incompatible.add(9);
                break;
            case 6:
                weight = 150;
                symbol = 't';
                food_type.add(1);
                habitats.add('l');
                filum = "Chordata";
                kelas = "Mammalia";
                ordo = "Carnivora";
                famili = "Felidae";
                genus = "Panthera";
                spesies = "tigris";
                for (int i = 1; i < 10; i++) {
                    if (i != 6) {
                        incompatible.add(i);
                    }
                }
                incompatible.add(21);
                break;
            case 7:
                weight = 350;
                symbol = '!';
                food_type.add(1);
                habitats.add('l');
                filum = "Chordata";
                kelas = "Mammalia";
                ordo = "Carnivora";
                famili = "Felidae";
                genus = "Panthera";
                spesies = "leo";
                for (int i = 1; i < 10; i++) {
                    if (i != 7) {
                        incompatible.add(i);
                    }
                }
                incompatible.add(21);
                break;
            case 8:
                weight = 1500;
                symbol = 'g';
                food_type.add(2);
                habitats.add('l');
                filum = "Chordata";
                kelas = "Mammalia";
                ordo = "Artiodactyla";
                famili = "Giraffidae";
                genus = "Giraffa";
                spesies = "camelopardalis";
                incompatible.add(6);
                incompatible.add(7);
                incompatible.add(9);
                break;
            case 9:
                weight = 80;
                symbol = 'k';
                food_type.sdd(1);
                habitats.add('l');
                filum = "Chordata";
                kelas = "Reptilia";
                ordo = "Squamata";
                famili = "Varanidae";
                genus = "Varanus";
                spesies = "komodoensis";
                for (int i = 1; i < 9; i++) {
                    incompatible.add(i);
                }
                incompatible.add(21);
                break;
            case 10:
                weight = 1;
                symbol = '~';
                food_type.add(2);
                habitats.add('w');
                filum = "Chordata";
                kelas = "Actinopterygii";
                ordo = "Gymnotiformes";
                famili = "Electrophoridae";
                genus = "Electrophorus";
                spesies = "electricus";
                for (int i = 11; i < 16; i++) {
                    incompatible.add(i);
                }
                incompatible.add(21);
                break;
            case 11:
                weight = 1000;
                symbol = '^';
                food_type.add(1);
                habitats.add('w');
                filum = "Chordata";
                kelas = "Chondrichtyes";
                ordo = "Lamniformes";
                famili = "Lamnidae";
                genus = "Carohardon";
                spesies = "carcharias";
                for (int i = 10; i < 16; i++) {
                    if (i != 11) {
                        incompatible.add(i);
                    }
                }
                incompatible.add(21);
                break;
            case 12:
                weight = 30;
                symbol = '=';
                food_type.add(1);
                habitats.add('w');
                filum = "Chordata";
                kelas = "Mammalia";
                ordo = "Pinnipedia";
                famili = "Phocidae";
                genus = "Phoca";
                spesies = "vitulina";
                for (int i = 10; i < 16; i++) {
                    if ((i != 12) || (i != 14)) {
                        incompatible.add(i);
                    }
                }
                break;
            case 13:
                weight = 150;
                symbol = '\\';
                food_type.add(1);
                habitats.add('w');
                filum = "Chordata";
                kelas = "Chondricthyes";
                ordo = "Myliobatiformes";
                famili = "Dasyatidae";
                genus = "Dasyatis";
                spesies = "pastinaca";
                for (int i = 10; i < 16; i++) {
                    if (i != 13) {
                        incompatible.add(i);
                    }
                }
                incompatible.add(21);
                break;
            case 14:
                weight = 1;
                symbol = 'j';
                food_type.add(1);
                food_type.add(2);
                habitats.add(1);
                filum = "Cnidaria";
                kelas = "Scyphozoa";
                ordo = "Semaeostomeae";
                famili = "Ulmaridae";
                genus = "Aurelia";
                spesies = "aurita";
                incompatible.add(10);
                incompatible.add(11);
                incompatible.add(13);
                break;
            case 15:
                weight = 15;
                symbol = 'o';
                food_type.add(1);
                habitats.add('w');
                filum = "Mollusca";
                kelas = "Cephalopoda";
                ordo = "Octopoda";
                famili = "Octopodidae";
                genus = "Octopus";
                spesies = "vulgaris";
                for (int i = 10; i < 15; i++) {
                    incompatible.add(i);
                }
                incompatible.add(21);
                break;
            case 16:
                weight = 2;
                symbol = 'y';
                food_type.add(1);
                habitats.add('a');
                filum = "Chordata";
                kelas = "Aves";
                ordo = "Strigidae";
                genus = "Tyto";
                spesies = "alba";
                incompatible.add(20);
                break;
            case 17:
                weight = 3;
                symbol = ';';
                food_type.add(1);
                habitats.add('a');
                filum = "Chordata";
                kelas = "Aves";
                ordo = "Pelecaniformes";
                famili = "Pelecanidae";
                genus = "Pelecanus";
                spesies = "onocrotalus";
                incompatible.add(20);
                break;
            case 18:
                weight = 2;
                symbol = 'c';
                food_type.add(2);
                habitats.add('a');
                filum = "Chordata";
                kelas = "Aves";
                ordo = "Psittaciformes";
                famili = "Cacatuidae";
                genus = "Cacatua";
                spesies = "sulphurea";
                incompatible.add(20);
                break;
            case 19:
                weight = 2;
                symbol = 'b';
                food_type.add(2);
                habitats.add('a');
                filum = "Chordata";
                kelas = "Aves";
                ordo = "Psittaciformes";
                famili = "Psittacoidea";
                genus = "Ara";
                spesies = "ararauna";
                incompatible.add(20);
                break;
            case 20:
                weight = 22;
                symbol = 'q';
                food_type.add(1);
                habitats.add('a');
                filum = "Chordata";
                kelas = "Aves";
                ordo = "Accipitriformes";
                famili = "Accipitridae";
                genus = "Spizaetus";
                spesies = "cirrhatus";
                for (int i = 16; i < 20; i++) {
                    incompatible.add(i);
                }
                break;
            case 21:
                weight = 35;
                symbol = ':';
                food_type.add(2);
                habitats.add('l');
                habitats.add('w');
                filum = "Chordata";
                kelas = "Reptilia";
                ordo = "Testudines";
                famili = "Emydidae";
                genus = "Trachemys";
                spesies = "scripta";
                incompatible.add(6);
                incompatible.add(7);
                incompatible.add(10);
                incompatible.add(11);
                incompatible.add(13);
                incompatible.add(15);
                break;
        }
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