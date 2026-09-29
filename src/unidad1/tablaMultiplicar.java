package unidad1;

import java.util.Scanner;

public class tablaMultiplicar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int i = 0; //iterador
        int j = 0; //numero a multiplicar
        int k = 0; //multiplicacion

        System.out.println("Ingrese el número a multiplicar");
        j = sc.nextInt();

        while (i <= 10) {
            System.out.println(j + "x" + k + "=" + (j * k));
            i++;
            k++;
        }
    }
}
