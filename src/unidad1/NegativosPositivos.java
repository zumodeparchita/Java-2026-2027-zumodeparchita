package unidad1;

import java.util.Scanner;

public class NegativosPositivos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int i = 0, numero = 0, negativos = 0, positivos = 0;
        do {
            System.out.println("Ingrese un número");
            numero = sc.nextInt();
            i++;
            if(numero < 0 && numero != 0){
                negativos++;
            } else if (numero > 0 && numero != 0){
                positivos++;
            }
        }while (i < 10);
        System.out.println("De lso 10 números ingresados:\n" + positivos + " son positivos\n" + negativos + " son negativos");
    }
}
