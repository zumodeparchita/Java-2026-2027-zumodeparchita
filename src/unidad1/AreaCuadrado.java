package unidad1;

import java.util.Scanner;

public class AreaCuadrado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime el lado de un cuadrado: ");
        int lado = teclado.nextInt();

        int area = lado*lado;
        System.out.println("El area del cuadrado es: " + area);

    }
}
