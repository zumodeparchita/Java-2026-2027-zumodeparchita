package unidad1;

import java.util.Scanner;

public class Arrays16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int dni = 0, resto;
        char[] letra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        System.out.println("Ingrese un número de DNI: ");
        dni = sc.nextInt();
        resto = dni % 23;

    System.out.println("La letra designada para este DNI es: " + letra[resto]);
        System.out.println();
    System.out.println("Por lo cual el DNI será: " + dni + letra[resto]);
    }
}
