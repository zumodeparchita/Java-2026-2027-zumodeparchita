package unidad1;

import java.util.Arrays;
import java.util.Random;

public class Arrays15 {
    public static void main (String[] args) {
        Random aleatorio = new Random();

        int [] enteros = new int[20];
        int [] pares = new int[20];
        int [] impares = new int[20];
        int contPares = 0, contImpares = 0;

        for(int i = 0; i < enteros.length; i++){
            enteros[i] = aleatorio.nextInt(0, 101);
        }

        for (int entero : enteros) {
            if (entero % 2 == 0) {
                pares[contPares] = entero;
                contPares++;
            } else {
                impares[contImpares] = entero;
                contImpares++;
            }
        }
        for (int i = 0; i < contPares; i++){
            enteros[i] = pares[i];
        }
        for (int i = 0; i < enteros.length; i++){
            enteros[i] = impares[i];
        }
        System.out.println(Arrays.toString(enteros));
        System.out.println(Arrays.toString(pares));
        System.out.println(Arrays.toString(impares));
    }
}
