package unidad1;

import java.util.Arrays;
import java.util.Random;

public class Arrays10 {
    public static void main(String[] args) {
        Random aleatorios = new Random();

        int[] arrayUno = new int[100];
        int[] arrayInverso = new int[100];
        int randomNum = 0;

        for (int i = 0; i < arrayUno.length; i++) {
            randomNum = aleatorios.nextInt(1, 101);
            arrayUno[i] = randomNum;
        }

        int j = 0;
        for(int i = arrayInverso.length-1; i>=0; i--){
            arrayInverso[i] = arrayUno[j];
            j++;
        }

//        for (int i = 0; i < arrayInverso.length; i++) {
//            arrayInverso[i] = arrayUno[arrayUno.length-1-i];
//
//        }

        System.out.println(Arrays.toString(arrayUno));
        System.out.println(Arrays.toString(arrayInverso));
    }
}
