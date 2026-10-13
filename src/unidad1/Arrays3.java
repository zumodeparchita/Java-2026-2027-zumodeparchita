package unidad1;

import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 0;
        int[] inverso = new int[10];

        for (int i = 0; i < 10; i++){
            System.out.println("ingrese un número");
            num = sc.nextInt();

            for (int j = 9; j > 0; j--) {
                inverso[j] = num;
            }

        }
    }
}
