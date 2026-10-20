package unidad1;

import java.util.Arrays;
import java.util.Random;

public class Arrays15v2 {
    public static void main (String[] args) {
        Random aleatorio = new Random();

        int[] enteros = new int[20];
        int pos = 0;
        int numTemp = 0;

        for(int i = 0; i < enteros.length; i++) {
            enteros[i] = aleatorio.nextInt(0, 101);
        }
        System.out.println();
        System.out.println(Arrays.toString(enteros));
        System.out.println();

        for(int i = 0; i < enteros.length; i++){
            if(enteros[i]%2==0){
                numTemp = enteros[i];
                enteros[i] = enteros[pos];
                enteros[pos] = numTemp;
                pos++;
            }
        }
        System.out.println(Arrays.toString(enteros));
    }
}