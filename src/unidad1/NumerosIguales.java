package unidad1;

import java.util.Scanner;

public class NumerosIguales {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime el primer número: ");
        int n1 = teclado.nextInt();

        System.out.print("Dime el segundo número: ");
        int n2 = teclado.nextInt();

        if (n1 == n2) {
            System.out.println("Los números son iguales");
        } else {
            if (n1 > n2) {
                System.out.println("El primer numero es mayor: " + n1);
            } else {
                System.out.println("El segundo numero es mayor: " + n2);
            }
        }
/*
        if (n1 == n2) {
            System.out.println("Los números son iguales");
        } else if (n1 > n2) {
            System.out.println("El primer numero es mayor: " + n1);
        } else {
            System.out.println("El segundo numero es mayor: " + n2);
        }
*/
    }
}
