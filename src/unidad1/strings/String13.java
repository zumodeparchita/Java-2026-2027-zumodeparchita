package unidad1.strings;

import java.util.Scanner;

public class String13 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String nombreCompleto = "";

        System.out.println("Ingrese su nombre");
        nombreCompleto = nombreCompleto.concat(sc.nextLine());
        System.out.println("Ingrese su primer apellido");
        nombreCompleto = nombreCompleto.concat(" " + sc.nextLine());
        System.out.println("Ingrese su segundo apellido");
        nombreCompleto = nombreCompleto.concat(" " + sc.nextLine());

        String[] palabras = nombreCompleto.split("\\s+");

        nombreCompleto = "";

        for (String palabra : palabras) {
            nombreCompleto = nombreCompleto.concat(" " + palabra.substring(0, 1)
                    .toUpperCase()
                    .concat(palabra.substring(1)
                    .toLowerCase()));
        }

        System.out.println(nombreCompleto.trim());
    }
}
