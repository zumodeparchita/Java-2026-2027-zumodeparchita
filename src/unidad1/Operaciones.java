package unidad1;

import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime el primer número: ");
        int n1 = teclado.nextInt();

        System.out.print("Dime el segundo número: ");
        int n2 = teclado.nextInt();

        int suma = n1 + n2;
        int resta = n1 - n2;
        int producto = n1 * n2;
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("El producto es: " + producto);

        if (n2 != 0) {
            int division = n1 / n2;
            System.out.println("La división es: " + division);
        } else {
            System.out.println("La división por cero no es posible");
        }

    }
}
