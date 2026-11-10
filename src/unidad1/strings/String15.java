package unidad1.strings;

import java.util.Arrays;
import java.util.Scanner;

public class String15 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String frase;
        String palabraMasLarga = "";
        String[] palabras;
        System.out.println("Ingrese una frase: ");
        frase = sc.nextLine().trim();

        palabras = frase.split("\\s+");

        for (String palabra : palabras) {
            if (palabra.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabra;
            }
        }
        System.out.println("La palabra más larga es: " + palabraMasLarga + "\n\tMide " + palabraMasLarga.length() + " centímetros de pura macizidad\n\tQue barbaridad.");
    }
}
