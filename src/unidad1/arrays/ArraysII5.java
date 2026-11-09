package unidad1.arrays;

import java.util.Random;

public class ArraysII5 {
    static void main(String[] args){
        Random aleatorio = new Random();

        //Rellena la matriz con valores aleatorios
        int[][] enteros = new int[5][6];
        for(int fila = 0; fila < enteros.length - 1; fila++){
            for(int columna = 0; columna < enteros[fila].length - 1; columna++){
                enteros[fila][columna] = aleatorio.nextInt(0, 21);
            }
        }
        //Sumar los valores de cada fila
        int sumaFil = 0;
        for(int fila = 0; fila < enteros.length - 1; fila++){
            for (int columna = 0; columna < enteros[fila].length - 1; columna++){
                sumaFil = sumaFil + enteros[fila][columna];
                enteros[fila][enteros[fila].length - 1] = sumaFil;
            }
            sumaFil = 0;
        }
        //Sumar los valores de cada columna
        int sumaCol = 0, sumaTotal=0;
        for(int columna = 0; columna < enteros[0].length - 1; columna++) {
            for (int fila = 0; fila < enteros.length - 1; fila++) {
                sumaCol += enteros[fila][columna];
                sumaTotal += enteros[fila][columna];
                enteros[enteros.length - 1][columna] = sumaCol;
            }
            sumaCol = 0;
        }
        enteros[4][5] = sumaTotal;

            //Escribir el array
        for(int fila = 0; fila < enteros.length; fila++){
            for(int columna = 0; columna < enteros[fila].length; columna++){
                System.out.printf("|%-5d", enteros[fila][columna]);;
            }
            System.out.println();
        }
    }
}
