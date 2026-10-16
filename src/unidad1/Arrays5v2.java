package unidad1;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays5v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia = 0, n;
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        System.out.println("Dime el número del día de la semana: ");
        dia = sc.nextInt();

        System.out.println("El día seleccioanado es: " + diasSemana[dia-1]);

    }
}
