package unidad1;

import java.util.Scanner;

public class PotenciaNumero {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int exponente = 0, base = 0, producto = 1, potencia = 0;

        System.out.println("Ingrese la base de la potencia");
        base = sc.nextInt();
        System.out.println("Ingrese el exponente");
        exponente = sc.nextInt();

        for(int i = 0; i < exponente; i++){
            producto = producto * base;
        }
        System.out.println(base + " elevado a " + exponente + " es igual a " + producto);
    }
}
