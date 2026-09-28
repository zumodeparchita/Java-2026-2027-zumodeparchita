package unidad1;

import java.util.Scanner;

public class IdentificadorNumeroNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1, i = 0;
        boolean negativo = false;

        while (i < 100 && num != 0){

            System.out.println("Ingrese los numeros a identificar: \n(Máximo 100 números) \nSi ya terminó de escribir todos los números, escriba 0");
            num = sc.nextInt();

            if (num < 0) {
                negativo = true;
            }
            i++;
        }
        System.out.println("Programa terminado \nMostrando resultado");
        if (negativo) {
            System.out.println("Existe un número negativo entre los ingresados");
        } else {
            System.out.println("No existe un número negativo entre los ingresados");
        }
        }


    }
