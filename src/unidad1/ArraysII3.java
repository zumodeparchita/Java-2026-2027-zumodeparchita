package unidad1;

public class ArraysII3 {
    static void main(String[] args){
        int [][] tabla = new int[10][10];


        for(int fila = 0; fila < tabla.length; fila++){
            for(int columna = 0; columna < tabla[fila].length; columna++){
                tabla[fila][columna] = (fila+1) * (columna+1);
                System.out.printf("|%-5d", tabla[fila][columna]);
            }
            System.out.println();
        }
    }
}
