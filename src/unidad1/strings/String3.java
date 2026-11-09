package unidad1.strings;

import java.util.Scanner;

public class String3 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String nombre, apellido1, apellido2;

        System.out.println("Introduce tu nombre");
        nombre = sc.nextLine();
        System.out.println("Introduce tu primer apellido");
        apellido1 = sc.nextLine();
        System.out.println("Introduce tu segundo apellido");
        apellido2 = sc.nextLine();

        String codigo = nombre.substring(0, 3)
                .concat(apellido1.substring(0,3))
                .concat(apellido2.substring(0,3))
                .toUpperCase();

        System.out.println(codigo);
    }
}
