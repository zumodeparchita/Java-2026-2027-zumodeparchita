package unidad1;

import java.util.Scanner;

public class EsPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0, i = 2, cont = 0;

        do {
            System.out.println("Escibre un número mayor que 0");
            num = sc.nextInt();
            if (num <= 1) {
                System.out.println("Debe ser positivo y mayor que 1");
            }
        } while (num <= 1);

        do{
            if (num % i == 0) {
                cont++;
            }
            i++;
        } while (i < num && cont == 0);
        if(cont == 0) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }


    }
}