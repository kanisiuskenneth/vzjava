// File : AnimalTest.java

package animal;

import javafx.geometry.Pos;
import org.junit.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import util.Position;

/**
 * Created by Ferdinandus Richard on 28-Mar-17.
 */
public class AnimalTest {
    @Test
    public void testDeer() {
        Animal deer = new Animal(new StringBuffer("Bambi"), 1, Position.makePos(14,10));
        assertTrue(deer.getWeight() == 50);
        assertTrue(deer.getId() == 1);
        assertTrue(deer.render() == 'v');
        assertTrue((deer.getPosition()).row == 14);
        assertTrue((deer.getPosition()).col == 10);
        assertTrue((deer.getName().toString()).equals("Bambi"));
        System.out.println("Deer correct");
    }

    @Test
    public void testChimpanzee() {
        Animal chimpanzee = new Animal(new StringBuffer("George"), 2, Position.makePos(14,18));
        assertTrue(chimpanzee.getWeight() == 60);
        assertTrue(chimpanzee.getId() == 2);
        assertTrue(chimpanzee.render() == '&');
        assertTrue((chimpanzee.getPosition()).row == 14);
        assertTrue((chimpanzee.getPosition()).col == 18);
        assertTrue((chimpanzee.getName().toString()).equals("George"));
        System.out.println("Chimpanzee correct");
    }

    @Test
    public void testBear() {
        Animal bear = new Animal(new StringBuffer("Pooh"), 3, Position.makePos(5, 53));
        assertTrue(bear.getWeight() == 120);
        assertTrue(bear.getId() == 3);
        assertTrue(bear.render() == '@');
        assertTrue((bear.getPosition()).row == 5);
        assertTrue((bear.getPosition()).col == 53);
        assertTrue((bear.getName().toString()).equals("Pooh"));
        System.out.println("Bear correct");
    }

    @Test
    public void testElephant() {
        Animal elephant = new Animal(new StringBuffer("BingBong"), 4, Position.makePos(10, 37));
        assertTrue(elephant.getWeight() == 5200);
        assertTrue(elephant.getId() == 4);
        assertTrue(elephant.render() == 's');
        assertTrue((elephant.getPosition()).row == 10);;
        assertTrue((elephant.getPosition()).col == 37);
        assertTrue((elephant.getName().toString()).equals("BingBong"));
        System.out.println("Elephant correct");
    }

    @Test
    public void testZebra() {
        Animal zebra = new Animal(new StringBuffer("Marty"), 5, Position.makePos(3, 5));
        assertTrue(zebra.getWeight() == 200);
        assertTrue(zebra.getId() == 5);
        assertTrue(zebra.render() == 'z');
        assertTrue((zebra.getPosition()).row == 3);
        assertTrue((zebra.getPosition()).col == 5);
        assertTrue((zebra.getName().toString()).equals("Marty"));
        System.out.println("Zebra correct");
    }

    @Test
    public void testTiger() {
        Animal tiger = new Animal(new StringBuffer("Tigress"), 6, Position.makePos(17, 71));
        assertTrue(tiger.getWeight() == 150);
        assertTrue(tiger.getId() == 6);
        assertTrue(tiger.render() == 't');
        assertTrue((tiger.getPosition()).row == 17);
        assertTrue((tiger.getPosition()).col == 71);
        assertTrue((tiger.getName().toString()).equals("Tigress"));
        System.out.println("Tiger correct");
    }

    @Test
    public void testLion() {
        Animal lion = new Animal(new StringBuffer("Simba"), 7, Position.makePos(17, 0));
        assertTrue(lion.getWeight() == 350);
        assertTrue(lion.getId() == 7);
        assertTrue(lion.render() == '!');
        assertTrue((lion.getPosition()).row == 17);
        assertTrue((lion.getPosition()).col == 0);
        assertTrue((lion.getName().toString()).equals("Simba"));
        System.out.println("Lion correct");
    }

    @Test
    public void testGiraffe() {
        Animal giraffe = new Animal(new StringBuffer("Melman"), 8, Position.makePos(5, 5));
        assertTrue(giraffe.getWeight() == 1500);
        assertTrue(giraffe.getId() == 8);
        assertTrue(giraffe.render() == 'g');
        assertTrue((giraffe.getPosition()).row == 5);
        assertTrue((giraffe.getPosition()).col == 5);
        assertTrue((giraffe.getName().toString()).equals("Melman"));
        System.out.println("Giraffe correct");
    }

    @Test
    public void testKomodo() {
        Animal komodo = new Animal(new StringBuffer("Komo"), 9, Position.makePos(13,68));
        assertTrue(komodo.getWeight() == 80);
        assertTrue(komodo.getId() == 9);
        assertTrue(komodo.render() == 'k');
        assertTrue((komodo.getPosition()).row == 13);
        assertTrue((komodo.getPosition()).col == 68);
        assertTrue((komodo.getName().toString()).equals("Komo"));
        System.out.println("Komodo correct");
    }

    @Test
    public void testElectricEel() {
        Animal electric_eel = new Animal(new StringBuffer("Eel"), 10, Position.makePos(13, 59));
        assertTrue(electric_eel.getWeight() == 1);
        assertTrue(electric_eel.getId() == 10) ;
        assertTrue(electric_eel.render() == '~');
        assertTrue((electric_eel.getPosition()).row == 13);
        assertTrue((electric_eel.getPosition()).col == 59);
        assertTrue((electric_eel.getName().toString()).equals("Eel"));
        System.out.println("ElectricEel correct");
    }

    @Test
    public void testShark() {
        Animal shark = new Animal(new StringBuffer("Bruce"), 11, Position.makePos(21, 64));
        assertTrue(shark.getWeight() == 1000);
        assertTrue(shark.getId() == 11);
        assertTrue(shark.render() == '^');
        assertTrue((shark.getPosition()).row == 21);
        assertTrue((shark.getPosition()).col == 64);
        assertTrue((shark.getName().toString()).equals("Bruce"));
        System.out.println("Shark correct");
    }

    @Test
    public void testSeal() {
        Animal seal = new Animal(new StringBuffer("Stefano"), 12, Position.makePos(18,12));
        assertTrue(seal.getWeight() == 30);
        assertTrue(seal.getId() == 12);
        assertTrue(seal.render() == '=');
        assertTrue((seal.getPosition()).row == 18);
        assertTrue((seal.getPosition()).col == 12);
        assertTrue((seal.getName().toString()).equals("Stefano"));
        System.out.println("Seal correct");
    }

    @Test
    public void testStingray() {
        Animal stingray = new Animal(new StringBuffer("Ray"), 13, Position.makePos(17, 64));
        assertTrue(stingray.getWeight() == 150);
        assertTrue(stingray.getId() == 13);
        assertTrue(stingray.render() == '\\');
        assertTrue((stingray.getPosition()).row == 17);
        assertTrue((stingray.getPosition()).col == 64);
        assertTrue((stingray.getName().toString()).equals("Ray"));
        System.out.println("Stingray correct");
    }

    @Test
    public void testJellyfish() {
        Animal jellyfish = new Animal(new StringBuffer("Jellyfish"), 14, Position.makePos(17, 44));
        assertTrue(jellyfish.getWeight() == 1);
        assertTrue(jellyfish.getId() == 14);
        assertTrue(jellyfish.render() == 'j');
        assertTrue((jellyfish.getPosition()).row == 17);
        assertTrue((jellyfish.getPosition()).col == 44);
        assertTrue((jellyfish.getName().toString()).equals("Jellyfish"));
        System.out.println("Jellyfish correct");
    }

    @Test
    public void testOctopus() {
        Animal octopus = new Animal(new StringBuffer("Hank"), 15, Position.makePos(17, 18));
        assertTrue(octopus.getWeight() == 15);
        assertTrue(octopus.getId() == 15);
        assertTrue(octopus.render() == 'o');
        assertTrue((octopus.getPosition()).row == 17);
        assertTrue((octopus.getPosition()).col == 18);
        assertTrue((octopus.getName().toString()).equals("Hank"));
        System.out.println("Octopus correct");
    }

    @Test
    public void testOwl() {
        Animal owl = new Animal(new StringBuffer("Julien"), 16, Position.makePos(1, 17));
        assertTrue(owl.getWeight() == 2);
        assertTrue(owl.getId() == 16);
        assertTrue(owl.render() == 'y');
        assertTrue((owl.getPosition()).row == 1);
        assertTrue((owl.getPosition()).col == 17);
        assertTrue((owl.getName().toString()).equals("Julien"));
        System.out.println("Owl correct");
    }

    @Test
    public void testPelican() {
        Animal pelican = new Animal(new StringBuffer("Nigel"), 17, Position.makePos(2, 8));
        assertTrue(pelican.getWeight() == 3);
        assertTrue(pelican.getId() == 17);
        assertTrue(pelican.render() == ';');
        assertTrue((pelican.getPosition()).row == 2);
        assertTrue((pelican.getPosition()).col == 8);
        assertTrue((pelican.getName().toString()).equals("Nigel"));
        System.out.println("Pelican correct");
    }

    @Test
    public void testCockatoo() {
        Animal cockatoo = new Animal(new StringBuffer("Rio"), 18, Position.makePos(5, 40));
        assertTrue(cockatoo.getWeight() == 2);
        assertTrue(cockatoo.getId() == 18);
        assertTrue(cockatoo.render() == 'c');
        assertTrue((cockatoo.getPosition()).row == 5);
        assertTrue((cockatoo.getPosition()).col == 40);
        assertTrue((cockatoo.getName().toString()).equals("Rio"));
        System.out.println("Cockatoo correct");
    }

    @Test
    public void testParrot() {
        Animal parrot = new Animal(new StringBuffer("Skully"), 19, Position.makePos(2, 41));
        assertTrue(parrot.getWeight() == 2);
        assertTrue(parrot.getId() == 19);
        assertTrue(parrot.render() == 'b');
        assertTrue((parrot.getPosition()).row == 2);
        assertTrue((parrot.getPosition()).col == 41);
        assertTrue((parrot.getName().toString()).equals("Skully"));
        System.out.println("Parrot correct");
    }

    @Test
    public void testEagle() {
        Animal eagle = new Animal(new StringBuffer("Sam"), 20, Position.makePos(20, 24));
        assertTrue(eagle.getWeight() == 22);
        assertTrue(eagle.getId() == 20);
        assertTrue(eagle.render() == 'q');
        assertTrue((eagle.getPosition()).row == 20);
        assertTrue((eagle.getPosition()).col == 24);
        assertTrue((eagle.getName().toString()).equals("Sam"));
        System.out.println("Eagle correct");
    }

    @Test
    public void testTurtle() {
        Animal turtle = new Animal(new StringBuffer("Squirt"), 21, Position.makePos(17, 0));
        assertTrue(turtle.getWeight() == 35);
        assertTrue(turtle.getId() == 21);
        assertTrue(turtle.render() == ':');
        assertTrue((turtle.getPosition()).row == 17);
        assertTrue((turtle.getPosition()).col == 0);
        assertTrue((turtle.getName().toString()).equals("Squirt"));
        System.out.println("Turtle correct");
    }
}
