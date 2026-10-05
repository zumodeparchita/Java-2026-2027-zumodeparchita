package unidad1;

import java.util.Scanner;

public class HorasTranscurridas {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia1, hora2, dia2, hora1;

        do {
            System.out.println("Dia 1 (1=L, 2=M...):");
            dia1 = sc.nextInt();
            System.out.println("Hora 1 (0-23)");
            hora1 = sc.nextInt();

            System.out.println("Dia 2 (1=L, 2=M...):");
            dia2 = sc.nextInt();
            System.out.println("Hora 1 (0-23)");
            hora2 = sc.nextInt();

            if (dia1 < 1 || dia1 > 7 || dia2 < 1 || dia2 > 7 || hora1<0 || hora1>23 || hora2 < 0 || hora2 > 23 || dia2 <= dia1){
                System.out.println("Error, fechas incorrectas.\nIntentelo de nuevo.");
            }
        } while (dia1 < 1 || dia1 > 7 || dia2 < 1 || dia2 > 7 || hora1<0 || hora1>23 || hora2 < 0 || hora2 > 23 || dia2 <= dia1);

        int horasTranscurridas = (24-hora1) + (hora2) + (dia2 - dia1 - 1) * 24;

        System.out.println("Horas transcurridas: " + horasTranscurridas);
    }
}
