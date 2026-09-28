package unidad1;

import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int filas = 0, columnas = 0;
        String asterisco = "* ";

        do {
            System.out.println("Ingrese el número de filas");
            filas = sc.nextInt();
        } while (filas < 2 || filas > 10);

        do {
            System.out.println("Ingrese el número de columnas");
            columnas = sc.nextInt();
        } while (columnas < 2 || columnas > 15);

        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                System.out.print(asterisco);
            }
            System.out.println();
        }
    }
}
