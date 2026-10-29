package unidad1;

import java.util.Random;
import java.util.Scanner;

public class ArraysII10 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        int nPersonas = 0;
        int[][] mesas = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };

        for(int i = 0; i < mesas[0].length; i++){
            mesas[1][i] = aleatorio.nextInt(0, 5);
        }
        while (nPersonas != -1) {
            //Mostrar mesas y ocupantes
            for(int i = 0; i < mesas[0].length; i++){
                System.out.printf("Mesa nº:%3d |", mesas[0][i]);
            }
            System.out.println();
            for(int i = 0; i < mesas[0].length; i++){
                System.out.printf("Personas:%2d |", mesas[1][i]);
            }
            System.out.println();
            //Solicitar cantidad de personas
            System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa): ");
            nPersonas = sc.nextInt();
            //Exceso de personas (más de 4)
            if(nPersonas > 4) {
                System.out.println("Lo siento, no admitimos grupos de " + nPersonas + ", haga grupos de 4 personas como máximo e intente de nuevo");
            }
            //Fin de programa
            if(nPersonas == -1){
                System.out.println("Gracias. Hasta pronto.");
            }
            //
            if(nPersonas > 0 && nPersonas <= 4){

            }

            }
        }
    }

