package unidad1;

import java.util.Scanner;

public class MayorTresNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int n1 = teclado.nextInt();
        System.out.print("Introduce el segundo número: ");
        int n2 = teclado.nextInt();
        System.out.print("Introduce el tercer número: ");
        int n3 = teclado.nextInt();

        int mayor;
        if (n1 >= n2 && n1 >= n3) {
            mayor = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            mayor = n2;
        } else {
            mayor = n3;
        }
        System.out.println("El mayor es: " + mayor);

    }
}
