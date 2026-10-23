package unidad1;

public class ArraysII2 {
    public static void main(String[] args){
        int[][] matriz = new int[5][5];

        int num = 1;
        for(int fila = 0; fila < matriz.length; fila++){
            for(int columna = 0; columna < matriz[fila].length; columna++){
                matriz[fila][columna] = num++;
                System.out.printf("|%-5d", matriz[fila][columna]);
            }
            System.out.println();
        }
    }
}
