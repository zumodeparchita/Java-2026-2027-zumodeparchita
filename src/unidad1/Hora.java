package unidad1;

import java.util.Scanner;

public class Hora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int hh;
        int mm;
        int ss;

        System.out.println("Ingrese la hora");
        hh = teclado.nextInt();
        System.out.println("Ingrese los minutos");
        mm = teclado.nextInt();
        System.out.println("Ingrese los segundos");
        ss = teclado.nextInt();

            ss++;

            if (ss == 60) {
                ss = 0;
                mm++;
                if (mm == 60) {
                    mm = 0;
                    hh++;

                    if (hh == 24) {
                        hh = 0;

                    }
                }
            }
        System.out.println("la hora, transcurrido un segundo, es: \n" + hh + ":" + mm + ":" + ss);
        }
    }
