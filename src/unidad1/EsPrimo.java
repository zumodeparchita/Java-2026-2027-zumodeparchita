package unidad1;

import java.util.Scanner;

public class EsPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;

        do {
            System.out.println("Escibre un número mayor que 0");
            num = sc.nextInt();
            if(num <= 0) {
                System.out.println("Debe ser positivo");
            }
        } while (num <= 0);

        if (num % 2 != 0 || num % 3 != 0 || num % 5 != 0){
            System.out.println("El número es primo");
        } else {
            System.out.println("El número no es primo");
        }

    }
}
