package unidad1;

import java.util.Scanner;

public class MediaImparesMayorPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, numCont = 0, numContImp = 0, mayorPar = 0;
        double mediaImpar = 0;
        do {
            System.out.println("Ingrese un número positivo \nEscriba -1 para terminar");
            num = sc.nextInt();

            if (num <= 0 && num != -1) {
                System.out.println("Debe ser positivo mayor que 0");
            }
            if(num > 0) {
                numCont++;
            }
             if (num > 0 && num % 2 != 0) {
                 numContImp++;
             }
             if (num % 2 != 0 && num != -1) {
                 mediaImpar = mediaImpar + num;
             }
             if (num % 2 == 0 && num > mayorPar) {
                 mayorPar = num;
             }
        } while (num != -1);

        mediaImpar = mediaImpar / numCont;
        System.out.println("La cantidad de números ingresados es: " + numCont);
        System.out.println("La media de los impares es " + mediaImpar);
        System.out.println("El mayor par es " + mayorPar);



    }
}
