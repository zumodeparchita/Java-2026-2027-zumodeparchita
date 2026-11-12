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
        System.out.println("-------------------------------------------------");


        //Ejercicio 2: Método mostrarValorAbsoluto
        int num;
        System.out.println("Ingrese un número negativo: ");
        num = sc.nextInt();
        sc.nextLine();

        mostrarValorAbsoluto(num);
        System.out.println(num); //No se muestra negativo cuando se muestra desde el main porque se le prestó una copia al método.
        System.out.println("-------------------------------------------------");


        //Ejercicio 3: Método rellenarArray

        int[] enteros = new int[10];

        rellenarArray(enteros);

        System.out.println(Arrays.toString(enteros)); //Se muestra lleno el array porque el main le pasó una referencia al método, por lo que los valores cambian.
        //Se produce paso de parámetros por valor cuando son variables primitivas, por referencia cuando son variables inmutables (como String) u objetos.
        System.out.println("-------------------------------------------------");

        //Ejercicio 4: Método mostrarMayor

        mostrarMayor(85, 10);

        //Ejercicio 5: Método mostrarDNI

        mostrarDNI(12345678, 'z');

        //Ejercicio 6: Método convertirPrimeraLetraMayusculas
        String palabra, cadenaMod;
        System.out.println("Ingrese un texto:");
        palabra = sc.nextLine();

        System.out.println("Texto en main: " + palabra);

        cadenaMod = convertirPrimeraLetraMayusculas(palabra);

        System.out.println("Texto en main pasado por método: " + cadenaMod);
        System.out.println("-------------------------------------------------");

        //Ejercicio 7: Método calcularMayor

        int mayor = calcularMayor(25, 10);

        System.out.println("El mayor es " + mayor);
        System.out.println("-------------------------------------------------");

        //Ejercicio 8: Método formarDNI

        String dni;
        dni = formarDNI(23456789, 'x');
        System.out.println(dni);
        System.out.println("-------------------------------------------------");

        //Ejercicio 9: Método sonDiferentes
int x, y, z;
        System.out.println("Ingrese primer valor:");
        x = sc.nextInt();
        System.out.println("Ingrese segundo valor:");
        y = sc.nextInt();
        System.out.println("Ingrese tercer valor:");
        z = sc.nextInt();

        boolean resultado = sonDiferentes(x, y, z);
        if (!resultado){
            System.out.println("Son iguales");
        } else {
            System.out.println("Son diferentes");
        }
        System.out.println("-------------------------------------------------");

        //Ejercicio 10: Método buscarMayor

        int [] numeros = new int[10];
        int masGrande;

        rellenarArray(numeros);
        masGrande = buscarMayor(numeros);
        System.out.println(Arrays.toString(numeros) + "\n");

        System.out.println("El número mayor dentro del array es " + masGrande + ".");
        System.out.println("-------------------------------------------------");
    }

    static void mostrarTextoMayusculas(String texto) {
        System.out.println("Mostrar Texto Mayúsculas");
        texto = texto.toUpperCase();
        System.out.println(texto);
    }

    static void mostrarValorAbsoluto(int numero) {
        System.out.println("Mostrar Valor Absoluto");
        if (numero < 0) {
            numero = numero * -1;
        }

        System.out.println(numero);
    }

    static void rellenarArray(int[] array) {
        System.out.println("Rellenar Array");
        Random aleatorio = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio.nextInt(0, 101);
        }
    }

    static void mostrarMayor(int x, int y) {
        System.out.println("Mostrar Mayor");
        if (x > y) {
            System.out.println(x + " es mayor que " + y);
        } else {
            System.out.println(y + " es mayor que " + x);
        }
        System.out.println("-------------------------------------------------");
    }

    static void mostrarDNI(int parteNumerica, char letra) {
        System.out.println("Mostrar DNI");
        String letraDni = String.valueOf(letra).toUpperCase();
        System.out.println(parteNumerica + "-" + letraDni);
        System.out.println("-------------------------------------------------");
    }

    static String convertirPrimeraLetraMayusculas(String texto) {
        System.out.println("Convertir primera letra a mayúsculas");
        return "".concat(texto.substring(0, 1).toUpperCase())
                .concat(texto.substring(1).toLowerCase());
    }

    static int calcularMayor(int x, int y) {
        System.out.println("Calcular el mayor");
        int mayor;
        if (x > y) {
            mayor = x;
        } else {
            mayor = y;
        }
        return mayor;
    }

    static String formarDNI (int parteNumerica, char letra){
        System.out.println("Formar DNI");
        return parteNumerica + "-" + String.valueOf(letra).toUpperCase();

    }

    static boolean sonDiferentes(int x, int y, int z){
        boolean diferentes;
        diferentes = x != y || x != z;
        return diferentes;
    }

    static int buscarMayor(int [] array){
        int mayor = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            if(array[i] > mayor){
                mayor = array[i];
            }
        }
        return mayor;
    }
}
