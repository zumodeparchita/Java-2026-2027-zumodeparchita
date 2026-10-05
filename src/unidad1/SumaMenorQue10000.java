package unidad1;

import java.util.Scanner;

public class SumaMenorQue10000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0, suma = 0, contNum = 0, media = 0;
        do {
            System.out.println("Ingrese un número");
            num = sc.nextInt();

            contNum++;
            suma = suma + num;

        }  while (suma < 10000);

        media = suma / contNum;

        System.out.println("La suma total es " + suma);
        System.out.println("Cantidad de números ingresados " + contNum);
        System.out.println("La media del acumulado de los números es " + media);
    }
}
