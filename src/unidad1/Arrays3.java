package unidad1;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 0;
        int[] inverso = new int[10];

        for (int i = 0; i < inverso.length; i++){
            System.out.println("ingrese un número");
            num = sc.nextInt();
            inverso[i] = num;

        }
        System.out.println("Los números ingresados al inverso son: ");

        for (int i = inverso.length - 1; i >= 0; i--){
            System.out.print(inverso[i] + " ");
        }
    }
}
