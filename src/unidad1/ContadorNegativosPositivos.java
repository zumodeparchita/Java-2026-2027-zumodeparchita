package unidad1;

import java.util.Scanner;

public class ContadorNegativosPositivos {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int num=1, n = 0, p = 0;
        boolean positivo = false, negativo = false;


        int i = 0;
        while(i < 100 && num!=0){

        System.out.println("Ingrese los números a identificar: \n(Máximo 100) \nSi ya finalizó, escriba 0");
        num =sc.nextInt();

        if (num < 0) {
            negativo = true;
            n++;
            negativo = false;
        } else if (num > 0){
            positivo = true;
            p++;
            positivo = false;
        }
            i++;
        }

        System.out.println("La cantidad de números positivos ingresados es: " + p + "\nLa cantidad de números negativos ingresados es: " + n);
    }
}
