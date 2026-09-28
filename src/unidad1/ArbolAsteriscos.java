package unidad1;

import java.util.Scanner;

public class ArbolAsteriscos {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int filas = 0;

        do {
            System.out.println("Ingrese el número de filas:");
            filas = sc.nextInt();
        } while (filas < 4 || filas > 10);

        for(int i = 1; i <= filas; i++) { //Filas
            for (int j = 1; j <= (filas - i); j++) {//Espacios
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {//Asteriscos
                System.out.print("*");
            }
            System.out.println();
        }
            for(int i = 1; i <=2;i++){ //alto
                for(int j = 1; j <= filas - 2; j++){ //espacios
                    System.out.print(" ");
                }
                for(int k = 1; k <= 3; k++){ //ancho
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        }



