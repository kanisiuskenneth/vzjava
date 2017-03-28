package zoo;

import cage.Cage;
import cell.Cell;
import zoo.Zoo;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Richard on 28-Mar-17.
 */
public class Driver {
    public static Zoo zoo;
    private void initZoo() throws FileNotFoundException {
        Scanner fileIn = new Scanner(new File ("src/asset/map.txt"));
        try {
            fileIn.next();
            zoo = new Zoo(fileIn.nextInt(), fileIn.nextInt());
            fileIn.close();
        } finally {
            fileIn.close();
        }
    }
    private void initCell() throws IOException {
        BufferedReader fileIn = new BufferedReader(new FileReader("src/asset/map.txt"));
        fileIn.readLine();
        for (int i = 0; i < zoo.getRow(); i++) {
            for (int j = 0; j < zoo.getCol(); j++) {
                char buffer = (char) fileIn.read();
                zoo.data.setData(i, j, Cell(buffer));
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
                    || (isInBound(row,col-1) && it.cells.contains(zoo.getCell(row+1,col)))
                    || (isInBound(row,col-1) && it.cells.contains(zoo.getCell(row,col+1))))
                    && it.getType() == zoo.getCell(row,col).render()) {
                return it;
            }
        }
        return null;
    }
    private void initCage() throws IOException {
        BufferedReader fileIn = new BufferedReader(new FileReader("src/asset/map.txt"));
        try {
            for (int i = 0; i < zoo.getRow(); i++) {
                for (int j = 0; j < zoo.getCol(); j++) {
                    char current = (char) fileIn.read();
                    Cell temp = zoo.getCell(i, j);
                    if ((temp.render() == 'a') || (temp.render() == 'l') || (temp.render() == 'w')) {
                        if (Character.isUpperCase(current) && !temp.IsInCage()) {
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
        Scanner fileIn = new Scanner(new File("src/asset/map.txt"));
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
        } catch (IOException) {
            System.out.println("File Not Found");
        }
    }
}
