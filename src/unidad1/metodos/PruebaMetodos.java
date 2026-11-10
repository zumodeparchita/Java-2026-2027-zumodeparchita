package unidad1.metodos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PruebaMetodos {

    static void main() {
        Scanner sc = new Scanner(System.in);

        //Ejercicio 1: Método mostrarTextoMayúsculas
        String texto;

        System.out.println("Ingrese un texto: ");
        texto = sc.nextLine();

        mostrarTextoMayusculas(texto);
        System.out.println(texto); //No se muestra cambiado a mayúsculas porque String es inmutable


        //Ejercicio 2: Método mostrarValorAbsoluto
        int num;
        System.out.println("Ingrese un número negativo: ");
        num = sc.nextInt();
        sc.nextLine();

        mostrarValorAbsoluto(num);
        System.out.println(num); //No se muestra negativo cuando se muestra desde el main porque se le prestó una copia al método.


        //Ejercicio 3: Método rellenarArray

        int[] enteros = new int[10];

        rellenarArray(enteros);

        System.out.println(Arrays.toString(enteros)); //Se muestra lleno el array porque el main le pasó una referencia al método, por lo que los valores cambian.
        //Se produce paso de parámetros por valor cuando son variables primitivas, por referencia cuando son variables inmutables (como String) u objetos.

        //Ejercicio 4: Método mostrarMayor

        mostrarMayor(85, 10);

        //Ejercicio 5: Método mostrarDNI

        mostrarDNI(12345678, 'z');
    }

    static void mostrarTextoMayusculas(String texto) {
        System.out.println("Mostrar Texto Mayúsculas\n");
        texto = texto.toUpperCase();
        System.out.println(texto);
    }

    static void mostrarValorAbsoluto(int numero) {
        System.out.println("Mostrar Valor Absoluto\n");
        if (numero < 0) {
            numero = numero * -1;
        }

        System.out.println(numero);
    }

    static void rellenarArray(int[] array) {
        System.out.println("Rellenar Array\n");
        Random aleatorio = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio.nextInt(0, 101);
        }
    }

    static void mostrarMayor(int x, int y) {
        System.out.println("Mostrar Mayor\n");
        if (x > y) {
            System.out.println(x + " es mayor que " + y);
        } else {
            System.out.println(y + " es mayor que " + x);
        }
    }

    static void mostrarDNI(int parteNumerica, char letra) {
        System.out.println("Mostrar DNI\n");
        String letraDni = String.valueOf(letra).toUpperCase();
        System.out.println(parteNumerica + "-" + letraDni);
    }


}
