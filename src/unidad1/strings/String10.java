package unidad1.strings;

import java.util.Scanner;

public class String10 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String cadena;
        System.out.println("Ingrese una cadena de texto: ");
        cadena = sc.nextLine().trim();
        int contL = 0;
        int contD = 0;

        for(int i = 0; i < cadena.length(); i++){
            if(Character.isLetter(cadena.charAt(i))){
                contL++;
            } else if (Character.isDigit(cadena.charAt(i))){
                contD++;
            }
        }
        System.out.println("El número de letras en la cadena es de " + contL + " caracteres.");
        System.out.println("El número de digitos en la cadena es de " + contD + " digitos.");
    }
}
