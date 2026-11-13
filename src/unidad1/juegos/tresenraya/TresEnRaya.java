package unidad1.juegos.tresenraya;

import java.util.Random;
import java.util.Scanner;

public class TresEnRaya {
    static Scanner sc = new Scanner(System.in);
    static Random aleatorio = new Random();
    static final int TURNO_PERSONA = 1;
    static final int TURNO_PC = 2;

    static void main() {

        char[][] tablero = new char[3][3];
        char fichaJugador, fichaOrdenador;
        int turno;

        System.out.println("Bienvenido a tres en raya...\n");
        //Asignar fichas a los jugadores (Jugador y Ordenador)
        fichaJugador = seleccionarFicha();
        fichaOrdenador = asignarFichaOrdenador(fichaJugador);

        //Elegir turno
        turno = sortearTurno();

        //Iniciar tablero
        iniciarTableroEnBlanco(tablero);

        //Mostrar el tablero
        mostrarTablero(tablero);

        //Jugada Persona


    }

    static char seleccionarFicha() {
        char ficha;
        do {
            System.out.println("¿Qué ficha deseas (X - O)? ");
            ficha = sc.nextLine().toUpperCase().charAt(0);
        } while (ficha != 'X' && ficha != 'O');

        return ficha;
    }

    static char asignarFichaOrdenador(char fichaJugador) {
        char ficha;
        ficha = (fichaJugador == 'X') ? 'O' : 'X';

        return ficha;
    }

    static int sortearTurno() {
        int eleccion, moneda, turno;
        do {
            System.out.println("\nSorteo de turnos...");
            System.out.println("Elige cara (1) o cruz (2): ");
            eleccion = sc.nextInt();
        } while (eleccion != 1 && eleccion != 2);

        moneda = aleatorio.nextInt(1, 3);

        if (eleccion == moneda){
            System.out.println("Has acertado, juegas primero.");
            return TURNO_PERSONA;
        } else {
            System.out.println("No has acertado, juegas segundo.");
            return TURNO_PC;
        }
    }

    static void iniciarTableroEnBlanco(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    static void mostrarTablero(char[][] tablero) {

        System.out.println("\nTres en raya");
        System.out.println("   0   1   2  ");
        System.out.println("  ┌───┬───┬───┐");

        for (int fila = 0; fila < tablero.length; fila++) {
            System.out.print(fila + " │");
            for (int columna = 0; columna < tablero.length; columna++) {
                System.out.print(" " + tablero[fila][columna] + " │");
            }
            System.out.println();
            if (fila < tablero.length - 1) {
                System.out.println("  ├───┼───┼───┤");
            }

        }
        System.out.println("  └───┴───┴───┘");
    }

    static void jugadaPersona(char[][] tablero){
        int jugada, fila, columna;
do {
    System.out.println("Ingrese la fila que desea jugar: ");
    fila = sc.nextInt();
    System.out.println("Ingrese la columna que desea jugar: ");
    columna = sc.nextInt();
} while ((fila > 2 || fila < 0) || (columna > 2 ||  columna < 0));
    }
}
