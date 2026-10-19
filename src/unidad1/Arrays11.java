package unidad1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arrays11 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random aleatorio = new Random();

    int num = 0;
    int a = 0, b = 0;
    int [] numeros = new int[100];
    boolean [] cambiado = new boolean[100];

    for (int i = 0; i < numeros.length; i++){
        num = aleatorio.nextInt(0, 21);
        numeros[i] = num;
    }
        for (int numero : numeros) System.out.print(numero + " ");

        System.out.println("Ingrese el valor de búsqueda: \n(Entre 0 y 20)");
        a = sc.nextInt();
        System.out.println("Ingrese el valor de reemplazo: \n(Entre 0 y 20");
        b = sc.nextInt();

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] == a){
                numeros[i] = b;
                cambiado[i] = true;
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            if (cambiado[i]) {
                System.out.print("\"" + numeros[i] + "\"" + " ");
            } else {
                System.out.print(numeros[i] + " ");
            }
        }
    }
}
