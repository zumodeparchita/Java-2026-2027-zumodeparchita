package unidad1;

import java.util.Scanner;

public class IdentificadorCalificacion {
    public static void main(String[] args){

        /*Dibuja un ordinograma de un programa que lee una secuencia de notas (con valores que van de 0 a 10)
    que termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10. */

        Scanner sc = new Scanner(System.in);
        int cal = 0, i = 0;
        boolean nDiez = false;

        do {
            System.out.println("Ingrese una calificación: ");
            cal = sc.nextInt();

            if (cal == 10) {
                nDiez = true;
                i++;
                nDiez = false;
            }
        }
        while (cal != -1);

            System.out.println("Hubo en total " + i + " examenes con calificación 10");
        }
    }

