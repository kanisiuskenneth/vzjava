// File : Animal.java

package animal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import util.Position;

/**
 * Created by Ferdinandus Richard on 26-Mar-17.
 */

/**
 * Class Animal
 */
public class Animal {
    private StringBuffer name;
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
    private String sound;

    /**
     * Class constructor.
     * Membentuk class Animal berdasarkan parameter yang diberikan
     * @param animal_name nama dari Animal yang ingin dibentuk
     * @param identifier identifier dari Animal yang ingin dibentuk
     * @param pos posisi dari Animal yang ingin dibentuk
     */
    public Animal(StringBuffer animal_name, int identifier, Position pos) {
        name = animal_name;
        id = identifier;
        position = pos;
        food_type = new ArrayList<Integer>();
        habitats = new ArrayList<Character>();
        incompatible = new HashSet<Integer>();
        switch (identifier) {
            case 1:
                // Animal adalah Deer
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
                sound = "Meee...eeek";
                break;
            case 2:
                // Animal adalah Chimpanzee
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
                sound = "Ook oook !";
                break;
            case 3:
                // Animal adalah Bear
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
                sound = "GROOWL!!";
                break;
            case 4:
                // Animal adalah Elephant
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
                sound = "eROOWRRHhh!";
                break;
            case 5:
                // Animal adalah Zebra
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
                sound = "Hugh! Hough, hough!";
                break;
            case 6:
                // Animal adalah Tiger
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
                sound = "Groowwlll";
                break;
            case 7:
                // Animal adalah Lion
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
                sound = "Rooaar";
                break;
            case 8:
                // Animal adalah Giraffe
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
                sound = "Huuummm.....";
                break;
            case 9:
                // Animal adalah Komodo
                weight = 80;
                symbol = 'k';
                food_type.add(1);
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
                sound = "....hiss....";
                break;
            case 10:
                // Animal adalah ElectricEel
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
                sound = "blurrbb.. swoosh";
                break;
            case 11:
                // Animal adalah Shark
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
                sound = "Shooosshhh .....";
                break;
            case 12:
                // Animal adalah Seal
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
                sound = "Woonk, woonkk!";
                break;
            case 13:
                // Animal adalah Stingray
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
                sound = "Bluurrrbb blurrb";
                break;
            case 14:
                // Animal adalah Jellyfish
                weight = 1;
                symbol = 'j';
                food_type.add(1);
                food_type.add(2);
                habitats.add('w');
                filum = "Cnidaria";
                kelas = "Scyphozoa";
                ordo = "Semaeostomeae";
                famili = "Ulmaridae";
                genus = "Aurelia";
                spesies = "aurita";
                incompatible.add(10);
                incompatible.add(11);
                incompatible.add(13);
                sound = "Shoo.. shoo...";
                break;
            case 15:
                // Animal adalah Octopus
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
                sound = "Phoo ahhh";
                break;
            case 16:
                // Animal adalah Owl
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
                sound = "Hoot hoot hoot";
                break;
            case 17:
                // Animal adalah Pelican
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
                sound = "Heeenkk heeeenk";
                break;
            case 18:
                // Animal adalah Cockatoo
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
                sound = "Chirp chirp";
                break;
            case 19:
                // Animal adalah Parrot
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
                sound = "Squawk, HELLO! Squawk squawk";
                break;
            case 20:
                // Animal adalah Eagle
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
                sound = "Phweee !!";
                break;
            case 21:
                // Animal adalah Turtle
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
                sound = "Squeeekk";
                break;
        }
    }

    /**
     * @return weight dari Animal
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @return ID dari Animal
     */
    public int getId() {
        return id;
    }

    /**
     * Method dari Animal agar bisa bergerak ke atas dalam map
     * I.S. : Animal terdefinisi
     * F.S. : Posisi dari Animal bergerak ke atas dengan row berkurang 1
     */
    public void moveUp() {
        position.row--;
    }

    /**
     * Method dari Animal agar bisa bergerak ke bawah dalam map
     * I.S. : Animal terdefinisi
     * F.S. : Posisi dari Animal bergerak ke bawah dengan row bertambah 1
     */
    public void moveDown() {
        position.row++;
    }

    /**
     * Method dari Animal agar bisa bergerak ke kiri dalam map
     * I.S. : Animal terdefinisi
     * F.S. : Posisi dari Animal bergerak ke kiri dengan col berkurang 1
     */
    public void moveLeft() {
        position.col--;
    }

    /**
     * Method dari Animal agar bisa bergerak ke kanan dalam map
     * I.S. : Animal terdefinisi
     * F.S. : Posisi dari Animal bergerak ke kanan dengan col bertambah 1
     */
    public void moveRight() {
        position.col++;
    }

    /**
     * @return symbol dari Animal
     */
    public char render() {
        return symbol;
    }

    /**
     * Method untuk mendapatkan posisi dari Animal yang dibuat
     * @return Position Animal
     */
    public Position getPosition() {
        return position;
    }

    /**
     * Method untuk mendapatkan set of Incompatible dari Animal
     * @return Set of incompatible
     */
    public Set<Integer> getIncompatible() {
        return incompatible;
    }

    /**
     * Method untuk mendapatkan list of Habitats yang dapat ditinggali Animal
     * @return List of Habitats
     */
    public List<Character> getHabitats() {
        return habitats;
    }

    /**
     * @return nama dari Animal
     */
    public StringBuffer getName() {
        return name;
    }

    /**
     * Method untuk mendapatkan suara interaksi dengan Animal
     * @return String sound dari Animal
     */
    public String interact() {
        return sound;
    }

    /**
     * Method untuk mendapatkan jenis makanan yang dapat dimakan oleh Animal
     * @return List of Integer yang menyatakan foodtype (1-karnivor atau 2-herbivor)
     */
    public List<Integer> getFoodType() {
        return food_type;
    }
}