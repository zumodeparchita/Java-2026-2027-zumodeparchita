package unidad1.arrays;

import java.util.Random;

public class ArraysII9 {
    static void main(String[] args) {
        Random aleatorio = new Random();

        String[] pais = {"España", "Rusia", "Japón", "Australia" };
        int[][] estaturas = new int[4][10];

        //Rellenar de valores aleatorios
        for (int i = 0; i < estaturas.length; i++) {
            for (int j = 0; j < estaturas[i].length; j++) {
                estaturas[i][j] = aleatorio.nextInt(140, 211);
            }
        }
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, media = 0;

        for(int fila = 0; fila < estaturas.length; fila++){
            System.out.printf("%9s: ", pais[fila]);
            for (int columna = 0; columna < estaturas[fila].length; columna++) {
                System.out.printf("%3d  " ,estaturas[fila][columna]);
                if(estaturas[fila][columna] < min) min = estaturas[fila][columna];
                if(estaturas[fila][columna] > max) max = estaturas[fila][columna];
                media += estaturas[fila][columna];
            }
            media = (media/estaturas[fila].length);
            System.out.print("| " + media + " " + min + " " + max);
            System.out.println();
            media = 0;
        }
    }
}
