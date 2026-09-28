package unidad1;

import java.util.Scanner;

public class MultiploOcho {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = 0, i = 0, multiplo = 8;


        System.out.println("Ingrese cuántos múltiplos de 8 se mostrarán:");
        n = sc.nextInt();

        do {
            System.out.print(multiplo + "-");
            i++;
            multiplo = multiplo + 8;

        } while (i < n);
    }
}
