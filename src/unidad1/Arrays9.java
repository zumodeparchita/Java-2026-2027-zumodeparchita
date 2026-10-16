package unidad1;

import java.util.Arrays;
import java.util.Random;

public class Arrays9 {
    public static void main(String[] args) {
        Random aleatorios = new Random();
        int randomNum;
        int[] numeros = new int[20];
        int[] cuadrados = new int[20];
        int[] cubos = new int[20];

        for(int i = 0; i < numeros.length; i++){
            randomNum = aleatorios.nextInt(0, 101);
            numeros[i] = randomNum;
            cuadrados[i] = randomNum * randomNum;
            cubos[i] = randomNum * randomNum * randomNum;
        }

        System.out.printf("%-10s %-12s %-10s%n", "Número", "Cuadrado", "Cubo");
        System.out.println("-------------------------------------");
        for (int i = 0; i < numeros.length; i++){
            System.out.printf("%-10d %-12d %-10d%n", numeros[i], cuadrados[i], cubos[i]);
        }

    }
}
