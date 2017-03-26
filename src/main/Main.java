package main;

import util.Matrix;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner scan =  new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        Matrix m = new Matrix(r,c);
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                Object x = scan.next();
            }
        }
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++){
            }
            System.out.println();
        }
    }
}
