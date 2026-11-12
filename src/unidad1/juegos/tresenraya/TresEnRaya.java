package unidad1.juegos.tresenraya;

public class TresEnRaya {
    static void main() {
dibujarTablero();
    }

    static void dibujarTablero() {
        char[][] tablero = new char[3][3];
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero[i].length; j++){
                System.out.print(" | ");
                System.out.print(" + ");
            }
            System.out.println();
        }
    }
}
