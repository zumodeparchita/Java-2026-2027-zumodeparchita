package unidad1.juegos.busquedatesoro;

import java.util.Random;
import java.util.Scanner;

public class BuscaTesoro {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    static final int FILAS = 5, COLUMNAS = 5;
    static final char TESORO = '$';
    static final char TESORO_ENCONTRADO = '€';
    static final char MINA = '*';
    static final char MINA_ENCONTRADA = '!';
    static final char DISPARO = 'X';
    static final char BLANCO = ' ';

    static void main() {
        char[][] tablero = new char[FILAS][COLUMNAS];
        int jugarDeNuevo = 0;
        do {
            iniciarPartida(tablero);
            System.out.println("¿Quieres jugar de nuevo?\n\t1. Sí\n\t2. Salir");
            jugarDeNuevo = sc.nextInt();
            sc.nextLine();

        } while (jugarDeNuevo != 2);

    }

    static void iniciarPartida(char[][] tablero) {
        boolean partidaFinalizada;

        iniciarTablero(tablero, 3);
        System.out.println("¡Bienvenido a la Búsqueda del Tesoro!");
        mostrarTablero(tablero);
        do {
            partidaFinalizada = realizarJugada(tablero);
            mostrarTablero(tablero);
        } while (!partidaFinalizada);
    }

    static void iniciarTablero(char[][] tablero, int numMinas) {
        int filCord, colCord;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = BLANCO;
            }
        }
        //Colocar un tesoro
        filCord = random.nextInt(0, FILAS);
        colCord = random.nextInt(0, COLUMNAS);
        tablero[filCord][colCord] = TESORO;

        //Colocar minas
        while (numMinas > 0) {
            filCord = random.nextInt(0, FILAS);
            colCord = random.nextInt(0, COLUMNAS);

            if (tablero[filCord][colCord] == BLANCO) {
                tablero[filCord][colCord] = MINA;
                numMinas--;
            }
        }
    }

    static void mostrarTablero(char[][] tablero) {
        int n = tablero.length;
        if (n == 0) return;
        int m = tablero[0].length;

        // 1. Calculamos los dígitos necesarios para filas y columnas
        int anchoFila = String.valueOf(n - 1).length();
        int anchoCol = Math.max(3, String.valueOf(m - 1).length());
        String margenIzq = " ".repeat(anchoFila);
        String barraHoriz = "─".repeat(anchoCol);
        int padIzq = (anchoCol - 1) / 2;
        int padDer = anchoCol - 1 - padIzq;

        // 2. Encabezado de columnas
        System.out.print(margenIzq + " ");
        for (int col = 0; col < m; col++) {
            System.out.printf("%-" + (anchoCol + 1) + "d", col);
        }
        System.out.println();

        // 3. Borde superior (┌───┬───┐)
        System.out.print(margenIzq + "┌");
        for (int col = 0; col < m; col++) {
            System.out.print(barraHoriz + (col < m - 1 ? "┬" : "┐"));
        }
        System.out.println();

        // 4. Filas y separadores intermedios
        for (int fila = 0; fila < n; fila++) {
            System.out.printf("%" + anchoFila + "d│", fila);

            for (int col = 0; col < m; col++) {

                System.out.print(" ".repeat(padIzq));
                if (tablero[fila][col] == MINA || tablero[fila][col] == TESORO) {
                    System.out.print(BLANCO);
                } else {
                    System.out.print(tablero[fila][col]);
                }
                System.out.print(" ".repeat(padDer) + "│");
            }
            System.out.println();

            if (fila < n - 1) {
                System.out.print(margenIzq + "├");
                for (int col = 0; col < m; col++) {
                    System.out.print(barraHoriz + (col < m - 1 ? "┼" : "┤"));
                }
                System.out.println();
            }
        }

        // 5. Borde inferior (└───┴───┘)
        System.out.print(margenIzq + "└");
        for (int col = 0; col < m; col++) {
            System.out.print(barraHoriz + (col < m - 1 ? "┴" : "┘"));
        }

        System.out.println();
        System.out.println("\nPulsa Intro para continuar....");
        sc.nextLine();
    }

    static boolean realizarJugada(char[][] tablero) {
        int f, c;
        boolean partidaFinalizada;
        System.out.println("Ingrese las coordenadas a donde quiere disparar:");
        do {
            System.out.println("Fila...");
            f = sc.nextInt();
            sc.nextLine();
            System.out.println("Columna...");
            c = sc.nextInt();
            sc.nextLine();
        } while (f >= FILAS || f < 0 || c >= COLUMNAS || c < 0);
        partidaFinalizada = comprobarEstado(tablero, f, c);
        return partidaFinalizada;
    }

    static boolean comprobarEstado(char[][] tablero, int f, int c) {
        if (tablero[f][c] == TESORO) {
            //Marcar victoria
            tablero[f][c] = TESORO_ENCONTRADO;
            System.out.println("Has ganado !!! Haz encontrado el tesoro !!!\n");
            return true;
        } else if (tablero[f][c] == MINA) {
            //Marcar derrota
            tablero[f][c] = MINA_ENCONTRADA;
            System.out.println("Has perdido !!! Haz tocado una mina !!!\n");
            return true;
        } else {
            //Marcar disparo
            tablero[f][c] = DISPARO;
            System.out.println("No has encontrado nada...\n");
            return false;
        }
    }
}


