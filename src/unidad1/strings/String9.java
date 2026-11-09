package unidad1.strings;

import java.util.Scanner;

public class String9 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String cadena;
        String letra;
        String busqueda;
        char caracter;
        int cont = 0;
        System.out.println("Ingrese una cadena de texto: ");
        cadena = sc.nextLine().trim();
        busqueda = cadena.toLowerCase();

        System.out.println("Ingrese la letra que se va a buscar");
        letra = sc.nextLine().toLowerCase();
        caracter = letra.charAt(0);

        for (int i = 0; i < busqueda.length(); i ++){
            if (busqueda.charAt(i) == caracter){
                cont++;
            }
        }
        System.out.println("La letra " + letra + " aparece " + cont + " veces en la palabra " + cadena + ".\n");

        int resultado = busqueda.length() - busqueda.replaceAll(letra, "").length();
        System.out.println("La letra " + letra + " aparece " + resultado + " veces en la palabra " + cadena + ".");
    }
}
