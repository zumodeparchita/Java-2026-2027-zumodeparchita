package unidad1;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int [] tempMedia = new int[12];
        String [] mesesNombre = {"Enero", "Febrero", "Marzo","Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        for (int i = 0; i < tempMedia.length; i++){
            System.out.println("Ingrese la temperatura media de " + mesesNombre[i]);
            tempMedia[i] = sc.nextInt();
        }

        for(int i = 0; i < tempMedia.length; i++) {
            System.out.printf("%-15s", mesesNombre[i] + " ");
            for (int j = 0; j < tempMedia[i]; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}