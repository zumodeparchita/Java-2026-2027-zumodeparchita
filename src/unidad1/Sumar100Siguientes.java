package unidad1;

import java.util.Scanner;

public class Sumar100Siguientes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = 0, suma = 0;
        do {
            System.out.println("Ingrese un número positivo");
            num = sc.nextInt();
        } while (num <= 0);

    }
}
