package unidad1;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int[] numeros = new int[10];

        for(int i = 0; i < numeros.length; i++){
            System.out.println("Ingrese un número: ");
            num = sc.nextInt();
            numeros[i] = num;
        }

        for (int numero : numeros) {
            if (numero < min) {
                min = numero;
            }
            if (numero > max) {
                max = numero;
            }
        }

        System.out.println("El menor número ingresado es: " + min);
        System.out.println("El mayor número ingresado es: " + max);
    }
}
