package unidad1.strings;

import java.util.Scanner;

public class String13v2 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String nombre, apellido1, apellido2;
        String nombreCompleto = "";

        System.out.println("Ingrese su nombre:");
        nombre = sc.nextLine();

        System.out.println("Ingrese su primer apellido:");
        apellido1 = sc.nextLine();

        System.out.println("Ingrese su segundo apellido:");
        apellido2 = sc.nextLine();

        nombreCompleto = nombreCompleto.concat(nombre.substring(0, 1)
                .toUpperCase().concat(nombre.substring(1)
                        .toLowerCase() + " ")
                .concat(apellido1.substring(0, 1)
                        .toUpperCase().concat(apellido1.substring(1)
                                .toLowerCase() + " ").concat(apellido2.substring(0, 1)
                                .toUpperCase().concat(apellido2.substring(1)
                                .toLowerCase() + " "))));

        System.out.println(nombreCompleto.trim());
    }
}
