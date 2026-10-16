package unidad1;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, sumP = 0, sumN = 0;
        int [] posneg = new int[20];

        for (int i = 0; i < posneg.length; i++) {
            System.out.println("Ingrese los números");
            num = sc.nextInt();
            posneg[i] = num;
        }

        for (int j : posneg) {
            if (j < 0) {
                sumN = sumN + j;
            } else if (j > 0) {
                sumP = sumP + j;
            }
        }

        System.out.println("La suma de los positivos ingresados es: " + sumP);
        System.out.println("La suma de los negativos ingresados es: " + sumN);

    }
}
