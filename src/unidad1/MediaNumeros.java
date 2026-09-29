package unidad1;

import java.util.Scanner;

public class MediaNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int media = 0, numero = 0;
        double contadorN = 0;

        while (numero != -1) {

            System.out.println("Ingrese un número positivo\n(Si ya terminó, ingrese '-1')");
            numero = sc.nextInt();
            contadorN++;
            media = media + numero;
        }

        System.out.println("la media es: " + (media + 1) / (contadorN -1) );

    }
}
