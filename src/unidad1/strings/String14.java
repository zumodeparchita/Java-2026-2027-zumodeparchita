package unidad1.strings;

import java.util.Scanner;

public class String14 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String letraDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        String dni;
        String dniReal;
        int numero, resultado;
        char letra;

            System.out.println("Comprobar letra DNI...");
        do {
            System.out.print("DNI: ");
            dni = sc.nextLine().trim().toUpperCase();
        } while (dni.length() != 9 && !dni.matches("\\d{8}[A-Z]"));

        numero = Integer.parseInt(dni.substring(0, 8));
        letra = dni.charAt(8);
        resultado = numero % 23;

        if (letra == letraDNI.charAt(resultado)) {
            System.out.println("La letra es la correcta. Debe tener la letra " + letraDNI.charAt(resultado) + " y tiene la " + letra + ".");
            System.out.println("El DNI está correcto.");
        } else {
            System.out.println("La letra no es la correcta. Debe tener la letra " + letraDNI.charAt(resultado) + " y tiene la " + letra + ".");
            dniReal = String.valueOf(numero) + letraDNI.charAt(resultado);
            System.out.println("El DNI corregido sería " + dniReal + ".");
        }
    }
}
