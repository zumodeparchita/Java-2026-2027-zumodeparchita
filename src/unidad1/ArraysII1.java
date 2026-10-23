package unidad1;

import java.util.Arrays;

public class ArraysII1 {
    public static void main(String[] args){

        int [][] enteros = new int[3][6];

        enteros[0][0] = 0;
        enteros[0][1] = 30;
        enteros[0][2] = 2;
        enteros[0][5] = 5;
        enteros[1][0] = 75;
        enteros[2][2] = -2;
        enteros[1][4] = 0;
        enteros[2][3] = 9;
        enteros[2][5] = 11;

        for (int fila = 0; fila < enteros.length; fila++){
            for(int columna = 0; columna < enteros[fila].length; columna++){
                System.out.printf("|%-5d", enteros[fila][columna]);
            }
            System.out.println();
        }
    }
}
