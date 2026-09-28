package unidad1;

import java.util.Scanner;

public class ContadorHastaN {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un número");
        num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            System.out.println(i);
        }

    }
}
