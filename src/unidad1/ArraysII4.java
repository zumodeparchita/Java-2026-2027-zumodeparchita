package unidad1;

import java.util.Scanner;

public class ArraysII4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor de N: ");
        int n = sc.nextInt();
        System.out.println("Ingrese el valor de M: ");
        int m = sc.nextInt();

        int[][] matriz = new int[n][m];

        int valor;

        //Recorre y rellena con valores pedidos por teclado
        for(int fila = 0; fila < matriz.length; fila++){
            for(int columna = 0; columna < matriz[fila].length; columna++){
                System.out.println("Ingrese el valor que se almacenará en la Fila: " + fila + " Columna: " + columna);
                valor = sc.nextInt();
                matriz[fila][columna] = valor;
            }
        }
        int positivos = 0, negativos = 0, ceros = 0;
        for(int fila = 0; fila < matriz.length; fila++) {
            for(int columna = 0; columna < matriz[fila].length; columna++){

                if (matriz[fila][columna] < 0){
                    negativos++;
                } else if (matriz[fila][columna] > 0) {
                    positivos++;
                } else {
                    ceros++;
                }
            }
        }
        System.out.println("Entre los valores ingresados existen:\n\tMayores que 0: " + positivos + "\n\tMenores que 0: " + negativos + "\n\tIguales a 0: " + ceros);
    }
}
