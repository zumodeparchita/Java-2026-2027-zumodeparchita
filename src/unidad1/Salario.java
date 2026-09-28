package unidad1;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); //Lector
        int jornadaSem, tarifa, horasExtras  = 0; //Variables
        String nombreTrabajador;
        double tarifaExtra, salarioBruto, salarioNeto, impuestos = 0;


        System.out.println("Ingrese su nombre:");
        nombreTrabajador = teclado.nextLine();
        System.out.println("Ingrese cuantas horas trabajó esta semana:");
        jornadaSem = teclado.nextInt();
        System.out.println("Ingrese su tarifa por hora:");
        tarifa = teclado.nextInt(); //Información solicitada.

        tarifaExtra = tarifa * 1.5;

        if (jornadaSem >= 35) {
            horasExtras = (jornadaSem - 35);
            jornadaSem = 35;
        }

        salarioBruto = (jornadaSem * tarifa) + (horasExtras * tarifaExtra);
            if (salarioBruto > 500 && salarioBruto <= 900) {
                impuestos = (salarioBruto-500)*0.25;
            }else if (salarioBruto > 900){
                impuestos = (400 * 0.25) + ((salarioBruto - 900) * 0.45);
            }

        salarioNeto = (salarioBruto - impuestos);
        System.out.println("Su salario bruto es: " + salarioBruto + "\nEl total de impuestos a pagar es: " + impuestos);
        System.out.println("Su salario después de impuestos es " + salarioNeto);

    }
}
