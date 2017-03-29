package zoo;

import cage.Cage;
import cell.Cell;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import util.Position;
import zoo.Zoo;

import java.io.*;
import java.util.Scanner;
import java.lang.Character;

/**
 * Created by Richard on 28-Mar-17.
 */
public class Driver {
    public static Zoo zoo;
    private void initZoo() throws FileNotFoundException {
        Scanner fileIn = new Scanner(new File ("asset/map.txt"));
        try {
            fileIn.next();
            zoo = new Zoo(fileIn.nextInt(), fileIn.nextInt());
            fileIn.close();
        } finally {
            fileIn.close();
        }
    }
    private void initCell() throws IOException {
        BufferedReader fileIn = new BufferedReader(new FileReader("asset/map.txt"));
        fileIn.readLine();
        for (int i = 0; i < zoo.getRow(); i++) {
            for (int j = 0; j < zoo.getCol(); j++) {
                char buffer = (char) fileIn.read();
                Cell temp = new Cell(Character.toLowerCase(buffer));
                zoo.data.setData(i, j, temp);
                if(buffer == 'e') {
                    zoo.entrances.add(Position.makePos(i,j));
                }
            }
            fileIn.read();
        }
        fileIn.close();
    }
    private boolean isInBound(int i, int j) {
        return (i >= 0 && i < zoo.getRow() && j >= 0 && j < zoo.getCol());
    }
    private Cage getCage(int row, int col) {
        for(Cage it : zoo.cages) {
            if(((isInBound(row-1,col) &&it.cells.contains(zoo.getCell(row-1,col)))
                    || (isInBound(row,col-1) && it.cells.contains(zoo.getCell(row,col-1)))
                    || (isInBound(row+1,col) && it.cells.contains(zoo.getCell(row+1,col)))
                    || (isInBound(row,col+1) && it.cells.contains(zoo.getCell(row,col+1))))
                    && Character.toUpperCase(it.getType()) == Character.toUpperCase(zoo.getCell(row,col).render())) {
                return it;
            }
        }
        return null;
    }
    private void initCage() throws IOException {
        BufferedReader fileIn = new BufferedReader(new FileReader("asset/map.txt"));
        try {
            fileIn.readLine();
            for (int i = 0; i < zoo.getRow(); i++) {
                for (int j = 0; j < zoo.getCol(); j++) {
                    char current = (char) fileIn.read();
                    Cell temp = zoo.getCell(i, j);
                    if (temp.isHabitat()) {
                        if (Character.isUpperCase(current) && !temp.isInCage()) {
                            Cage ret = getCage(i, j);
                            zoo.getCell(i, j).assignCage();
                            if (ret == null) {
                                ret = new Cage(zoo.getCell(i, j).render());
                                ret.cells.add(zoo.getCell(i, j));
                                zoo.cages.add(ret);
                            } else {
                                ret.cells.add(zoo.getCell(i, j));
                            }
                        }
                    }
                }
                fileIn.read();
            }
        } finally {
            fileIn.close();
        }
    }
    private void initAnimal() throws FileNotFoundException {
        Scanner fileIn = new Scanner(new File("asset/map.txt"));
        try {
            fileIn.nextLine();
            // Melewatkan pembacaan peta
            for (int i = 0; i < zoo.getRow(); i++) {
                fileIn.nextLine();
            }
            fileIn.next();
            // Mendapatkan banyaknya animal yang ada di zoo
            int n = fileIn.nextInt();
            fileIn.next();
            for (int i = 0; i < n; i++) {
                int id = fileIn.nextInt();
                StringBuffer name = new StringBuffer(fileIn.next());
                int row = fileIn.nextInt();
                int col = fileIn.nextInt();
                Cell c = zoo.getCell(row, col);
                // Cek apakah Cell c yang diambil berada dalam sebuah cage
                for (Cage it : zoo.cages) {
                    if (it.cells.contains(c)) {
                        it.addAnimal(id, name, row, col);
                    }
                }
            }
        } finally {
            fileIn.close();
        }
    }
    public Driver() {
        try {
            initZoo();
            initCell();
            initCage();
            initAnimal();
        } catch (FileNotFoundException x) {
            System.out.println("File Not Found");
        } catch (IOException x) {
            System.out.println("File Not Found");
        }
    }
}
