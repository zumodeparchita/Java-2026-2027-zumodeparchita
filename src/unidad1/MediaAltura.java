package unidad1;

import java.util.Scanner;

public class MediaAltura {
    public static void main(String[] args){
        /*Codificar en  Java un programa que permita pedir a altura de  n persoas e mostre a súa media. Emprega un bucle while.*/

        Scanner sc = new Scanner(System.in);

        int nPersonas = 0, altura = 0, i = 0;
        float media = 0;

        System.out.println("Indíque el número de personas para el cálculo:");
        nPersonas = sc.nextInt();

        while (i < nPersonas && altura >= 0) {
            System.out.println("Indíque la altura de cada persona individualmente (Representado en centímetros)");
            altura = altura + sc.nextInt();
            i++;
        }
        media = altura / nPersonas;
        System.out.println("La media de altura de las " + nPersonas + " personas es: " + media);




    }
}
