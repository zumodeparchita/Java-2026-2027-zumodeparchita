package unidad1.strings;

import java.util.Scanner;

public class String6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String texto, letra;
        char letraChar;
        int cont = 0;
        System.out.println("Introduzca un texto:");
        texto = sc.nextLine().toLowerCase();
        System.out.println("Ahora introduzca una letra para ver cuántas veces aparece en el texto:");
        letra = sc.nextLine().toLowerCase();
        letraChar = letra.charAt(0);

        for (int i = 0; i < texto.length(); i++) {
            if (letraChar == texto.charAt(i)){
                cont++;
            }
        }
        System.out.println("La letra " + letraChar + " aparece " + cont + " veces en la palabra.");
    }
}
