package unidad1.strings;

import java.util.Arrays;
import java.util.Scanner;

public class String16 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String texto, letra, letrasUsadas = "";
        char caracter;

        System.out.println("Ingrese un texto: ");
        texto = sc.nextLine().toUpperCase().trim();

        for(int i = 0; i < texto.length(); i++){
            caracter = texto.charAt(i);
            letra = String.valueOf(caracter);
            letrasUsadas = letrasUsadas.concat(letra + " ");
            abecedario = abecedario.replace(letra, "");
        }
        System.out.println("Las letras restantes son " + abecedario);
    }
}
