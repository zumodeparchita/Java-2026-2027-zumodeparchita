package unidad1;

import java.util.Scanner;

public class String11 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String frase, letra;
        String fraseInversa = "";
        char caracter;
        System.out.println("Ingrese una frase para comprobar si es un palíndromo: ");
        frase = sc.nextLine().trim();
        for (int i = frase.length() - 1; i >= 0; i--){
            caracter = frase.charAt(i);
            letra = String.valueOf(caracter);
            fraseInversa = fraseInversa.concat(letra);
        }
        frase = frase.replace(" ", "");
        fraseInversa = fraseInversa.replace(" ", "");

        if(frase.equalsIgnoreCase(fraseInversa)){
            System.out.println("La frase sí es un palíndromo. Se lee igual al derecho y al revés.");
        } else {
            System.out.println("La frase no es un palíndromo.\n\n");
        }

        int i = 0;
        int j = frase.length() - 1;
        frase = frase.toLowerCase();

        while (i < j && frase.charAt(i) == frase.charAt(j)){
            i++;
            j--;
        }
        if (i == j){
            System.out.println("Si es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }
    }
}
