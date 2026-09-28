package unidad1;

import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un número: ");
        int n1 = teclado.nextInt();

        System.out.println("Dime otro número: ");
        int n2 = teclado.nextInt();

        System.out.println("Los numeros ordenados de menor a mayor son: ");

        if (n1 < n2) {
            System.out.println(n1 + ", " + n2);
        } else {
            System.out.println(n2 + ", " + n1);
        }
    }
}
