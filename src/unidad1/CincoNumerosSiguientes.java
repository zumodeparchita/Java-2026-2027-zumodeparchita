package unidad1;

import java.util.Scanner;

public class CincoNumerosSiguientes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        System.out.println("Ingrese un número entero positivo: ");
        num = sc.nextInt();

        for (int j = 0; j < 5; j++) {
            int i = 2;
            while (i < num && num % i != 0) {
                i++;
            }
            if (i == num) {
                System.out.println(num + "Es primo");
            } else {
                System.out.println(num + "No es primo");
            }
            num++;
        }
    }
}