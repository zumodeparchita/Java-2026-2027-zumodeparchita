package unidad1.strings;

import java.util.Scanner;

public class String7 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String frase;
        System.out.println("Ingrese una frase: ");
        frase = sc.nextLine().trim();
        int cont = 0;
        boolean enPalabra = false;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ' && frase.charAt(i + 1) != ' ') {
                cont++;
            }
        }

        System.out.println("Hay un total de " + (cont+1) + " palabras.\n\n");


        int cont2 = 0;
        String[] palabras = frase.split("\\s+");
        System.out.println("Hay un total de " + palabras.length + " palabras.\n\n");
    }
}

