package unidad1;

import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int calificacion;
        String calAlfabetica;

        System.out.println("Ingrese su calificacion");
        calificacion = teclado.nextInt();
        if (calificacion >= 0 && calificacion<= 10) {
            if (calificacion < 3) {
                calAlfabetica = "Muy deficiente";
                System.out.println("Su calificación es: \n" + calAlfabetica);
            } else if (calificacion < 5) {
                calAlfabetica = "Insuficiente";
                System.out.println("Su calificación es: \n" + calAlfabetica);
            } else if (calificacion < 6) {
                calAlfabetica = "Suficiente";
                System.out.println("Su calificación es: \n" + calAlfabetica);
            } else if (calificacion < 7) {
                calAlfabetica = "Bien";
                System.out.println("Su calificación es: \n" + calAlfabetica);
            } else if (calificacion < 9) {
                calAlfabetica = "Notable";
                System.out.println("Su calificación es: \n" + calAlfabetica);
            } else {
                calAlfabetica = "Sobresaliente";
                System.out.println("Su calificación es: \n" + calAlfabetica);
            }
        } else {
            System.out.println("La calificacion ingresada es inválida");
        }
    }
}