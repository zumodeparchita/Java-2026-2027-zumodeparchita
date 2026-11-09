package unidad1.strings;

import java.util.Scanner;

public class String12 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String palabra1, palabra2, letra;
        char caracter;

        System.out.println("Ingrese una palabra:");
        palabra1 = sc.nextLine().trim().toLowerCase();
        palabra1 = palabra1.replace(" ", "");
        System.out.println("Ingrese otra palabra:");
        palabra2 = sc.nextLine().trim().toLowerCase();
        palabra2 = palabra2.replace(" ", "");

        if (palabra1.length() != palabra2.length()) {
            System.out.println("No es un anagrama.");
        } else {
            for (int i = 0; i < palabra1.length(); i++) {
                caracter = palabra1.charAt(i);
                letra = String.valueOf(caracter);
                palabra2 = palabra2.replaceFirst(letra, "");
            }
            if (palabra2.isEmpty()) {
                System.out.println("Es un anagrama.");
            } else {
                System.out.println("No es un anagrama.");
            }

        }
    }
}
