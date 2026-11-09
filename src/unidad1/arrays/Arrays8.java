package unidad1.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p, q, cont = 0;
        int[] regla;

        System.out.println("Ingrese el valor de P");
        p = sc.nextInt();
        System.out.println("Ingrese el valor de Q");
        q = sc.nextInt();


        regla = new int[q-p+1];

        for (int i = 0; i < regla.length; i++) {
                regla[i] = p;
                p++;
        }
        System.out.println(Arrays.toString(regla));
    }
}
