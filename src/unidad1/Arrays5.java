package unidad1;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia = 0;
        String[] diasSemana = new String[7];

        diasSemana[0] = "Lunes";
        diasSemana[1] = "Martes";
        diasSemana[2] = "Miércoles";
        diasSemana[3] = "Jueves";
        diasSemana[4] = "Viernes";
        diasSemana[5] = "Sábado";
        diasSemana[6] = "Domingo";

        System.out.println("Dime el número del día de la semana: ");
        dia = sc.nextInt();
        switch(dia){
            case 1:
                System.out.println("El día seleccionado es: " + diasSemana[0]);
                break;
            case 2:
                System.out.println("El día seleccionado es: " + diasSemana[1]);
                break;
            case 3:
                System.out.println("El día seleccionado es: " + diasSemana[2]);
                break;
            case 4:
                System.out.println("El día seleccionado es: " + diasSemana[3]);
                break;
            case 5:
                System.out.println("El día seleccionado es: " + diasSemana[4]);
                break;
            case 6:
                System.out.println("El día seleccionado es: " + diasSemana[5]);
                break;
            case 7:
                System.out.println("El día seleccionado es: " + diasSemana[6]);
                break;
        }
    }
}