package unidad1.arrays;

import java.util.Scanner;

public class ArraysII7 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nPersonas;

        System.out.println("Ingrese el número de personas");
        nPersonas = sc.nextInt();
        double[][] empleados = new double[nPersonas][2];

        for(int p = 0; p < empleados.length; p++){
            System.out.println("¿La persona es hombre o mujer?\n(0 --> hombre | 1 --> mujer)");
            empleados[p][0] = sc.nextInt();
            System.out.println("¿Cual es su salario?");
            empleados[p][1] = sc.nextInt();
        }
        int hombre = 0, mujer = 0;
        double sumHombre = 0, sumMujer = 0;
        for(int p = 0; p < empleados.length; p++){
            if(empleados[p][0] == 0){
                sumHombre = sumHombre + empleados[p][1];
                hombre++;
            }
            if(empleados[p][0] == 1){
                sumMujer = sumMujer + empleados[p][1];
                mujer++;
            }
        }

        for(int i = 0; i < empleados.length; i++){
                System.out.printf("|%-5d|%-5.2f\n", (int)empleados[i][0], empleados[i][1]);
        }
        System.out.printf("El salario de los hombres promedia: %.2f Euros al mes%n", sumHombre / hombre);
        System.out.printf("El salario de las mujeres promedia: %.2f Euros al mes%n", sumMujer / mujer);

    }
}
