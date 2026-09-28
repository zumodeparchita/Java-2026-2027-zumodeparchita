package unidad1;

import java.util.Scanner;

public class NumerosFactoriales {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero, i;
        String operador = "x";
        long factorial = 1;
        System.out.println("Introduzca un número: ");
        numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Debes ingresar un número positivo, mayor o igual que 0");
        } else {

            for (i = numero; i > 0; i--) {
                factorial = factorial * i;

                if (i == 1) {
                    operador = "=";
                }

                System.out.print(i + operador);
            }
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
    }
}

//Me averguenza lo mucho que tardé en llegar a la solución.