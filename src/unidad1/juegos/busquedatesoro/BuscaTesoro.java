package unidad1.juegos.busquedatesoro;

import java.util.Random;
import java.util.Scanner;

public class BuscaTesoro {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    static final int FILAS = 5, COLUMNAS = 5;
    static final char TESORO = '$';
    static final char MINA = '*';
    static final char DISPARO = 'X';

    static void main() {
        char[][] tablero = new char[FILAS][COLUMNAS];

        iniciarTablero(tablero, 3, 1);
        mostrarTablero(tablero);
    }

    static void iniciarTablero(char[][] tablero, int numMinas, int numTesoros) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = ' ';
            }
        }
        for (int i = 0; i < numMinas; i++) {
            tablero[random.nextInt(0, FILAS)][random.nextInt(0, COLUMNAS)] = MINA;
        }
        for (int i = 0; i < numTesoros; i++) {
            tablero[random.nextInt(0, FILAS)][random.nextInt(0, COLUMNAS)] = TESORO;
        }
    }

    static void mostrarTablero(char[][] tablero) {
        int tam = tablero.length;

        // Cabecera con los números de columna
        System.out.print("    ");
        for (int columna = 0; columna < tam; columna++) {
            System.out.print(columna + "   ");
        }
        System.out.println();

        dibujarLinea(tam, "┌", "┬", "┐");

        for (int fila = 0; fila < tam; fila++) {
            System.out.print(fila + " │");
            for (int columna = 0; columna < tam; columna++) {
                System.out.print(" " + tablero[fila][columna] + " │");
            }
            System.out.println();
            if (fila < tam - 1) {
                dibujarLinea(tam, "├", "┼", "┤");
            }
        }
        dibujarLinea(tam, "└", "┴", "┘");

        System.out.println("\nPulsa intro para continuar...\n");
        sc.nextLine();
    }

    static void dibujarLinea(int tam, String izquierda, String medio, String derecha) {
        System.out.print("  " + izquierda);
        for (int columna = 0; columna < tam; columna++) {
            System.out.print("───");
            if (columna < tam - 1) {
                System.out.print(medio);
            } else {
                System.out.println(derecha);
            }
        }
    }
}

