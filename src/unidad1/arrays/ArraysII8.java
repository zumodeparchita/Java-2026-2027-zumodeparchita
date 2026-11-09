package unidad1.arrays;

import java.util.Random;

public class ArraysII8 {
    static void main(String[] args){
        Random aleatorio = new Random();

        int [][] numeros = new int[10][10];

        for(int fila = 0; fila < numeros.length; fila++){
            for(int columna = 0; columna < numeros[fila].length; columna++){
                numeros[fila][columna] = aleatorio.nextInt(200, 301);
            }
        }
        for(int fila = 0; fila < numeros.length; fila++){
            for (int columna = 0; columna < numeros[fila].length; columna++){
                System.out.printf("|%-5d",numeros[fila][columna]);
            }
            System.out.println();
        }
        System.out.println("\n");
        String tab = "";
        for(int i = 0; i < numeros.length; i++){
            System.out.printf(tab + "|%-5d\n", numeros[i][i]);
            tab+="\t";
        }

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, cont = 0;
        double sum = 0;
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i][i] < min) min = numeros[i][i];
            if(numeros[i][i] > max) max = numeros[i][i];
            sum += numeros[i][i];
            cont++;
        }
        System.out.println();
        System.out.println("El número mayor es: " + max);
        System.out.println("El número menor es: " + min);
        System.out.printf("La media de los números es: %.2f", sum/cont);
    }
}
