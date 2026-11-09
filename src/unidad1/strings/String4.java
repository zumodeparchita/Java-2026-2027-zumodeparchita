package unidad1.strings;

import java.util.Scanner;

public class String4 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String palabra;
        char letra;
        int contA = 0;
        int contE = 0;
        int contI = 0;
        int contO = 0;
        int contU = 0;
        System.out.println("Introduce una palabra");
        palabra = sc.nextLine().toLowerCase();;

        for (int i = 0; i < palabra.length(); i++) {
            letra = palabra.charAt(i);

            if (letra == 'a') {
                contA++;
            } else if (letra == 'e') {
                contE++;
            } else if (letra == 'i') {
                contI++;
            } else if (letra == 'o') {
                contO++;
            } else if (letra == 'u') {
                contU++;
            }
        }
        System.out.println("Nº de aes: " + contA);
        System.out.println("Nº de es: " + contE);
        System.out.println("Nº de ies: " + contI);
        System.out.println("Nº de oes: " + contO);
        System.out.println("Nº de ues: " + contU);
    }
}


