package unidad1;

import java.util.Scanner;

public class Arrays13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v, i, n;

        System.out.println("Indica el valor inicial: ");
        v = sc.nextInt();
        System.out.println("Indica el incremento: ");
        i = sc.nextInt();
        System.out.println("Indica el tamaño de la secuencia aritmética: ");
        n = sc.nextInt();
        int [] secArit = new int[n];

        secArit[0] = v;
        for (int j = 1; j < secArit.length; j++){
            secArit[j] = secArit[j - 1] + i;
        }
        System.out.println("La secuencia aritmética es: ");
        for(int j = 0; j < secArit.length; j++){
            System.out.print(secArit[j] + ", ");
        }
    }
}
