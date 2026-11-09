package unidad1.arrays;

import java.util.Scanner;

public class ArraysII6 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] notas = new int[4][5];

        //Llenar el array con las notas
        for(int alumno = 0; alumno < notas.length; alumno++){
            for(int asignatura = 0; asignatura < notas[alumno].length; asignatura++){
                System.out.println("Ingresa la calificación del alumno " + (alumno + 1) + " para la asignatura " + (asignatura + 1) + "\n(entre 0 y 10)");
                notas[alumno][asignatura] = sc.nextInt();
                System.out.println("....................................");
            }
        }
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, acum = 0;

        for(int alumno = 0; alumno < notas.length; alumno++){
            for (int asignatura = 0; asignatura < notas[alumno].length; asignatura++){
                if (notas[alumno][asignatura] > max){
                    max = notas[alumno][asignatura];
                }
                if (notas[alumno][asignatura] < min){
                    min = notas[alumno][asignatura];
                }
                acum = acum + notas[alumno][asignatura];
            }
            System.out.println("La calificación máxima del alumno " + (alumno+1) + " es " + max);
            System.out.println("La calificación mínima del alumno " + (alumno+1) + " es " + min);
            System.out.println("La calificación media  del alumno " + (alumno+1) + " es " + (acum/notas[alumno].length));
            System.out.println();
            min = Integer.MAX_VALUE; max = Integer.MIN_VALUE; acum = 0;
        }
    }
}
