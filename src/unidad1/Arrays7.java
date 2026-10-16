package unidad1;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m;

        System.out.println("Ingrese el valor de N: ");
        n = sc.nextInt();
        System.out.println("Ingrese el valor de M: ");
        m = sc.nextInt();

        int [] enteros = new int[n];
        for(int i = 0; i < enteros.length; i++){
            enteros[i] = m;
        }
        System.out.println(Arrays.toString(enteros));
    }
}
