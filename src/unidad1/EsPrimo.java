package unidad1;

import java.util.Scanner;

public class EsPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;

        do {
            System.out.println("Ingrese un número positivo mayor que 1");
            num = sc.nextInt();
        } while (num <=1);

        int i = 2;
        while (i < num && num % i != 0){
            i++;
        }
        if (i == num) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }

    }
}