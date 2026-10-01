package unidad1;

import java.util.Scanner;

public class CajaFuerte {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int codigo = 1710, intento = 0, i = 0, nIntentos = 4;

        do {
            System.out.println("Ingrese el código");
            intento = sc.nextInt();
            i++;

            if(intento != codigo){
                System.out.println("Lo siento, esa no es la combinación correcta");
                System.out.println("Te quedan " + (nIntentos - i) + " intentos");
            }

        } while (i < 4 && intento != codigo);

        if (intento == codigo) {
            System.out.println("La caja se ha abierto satisfactoriamente");
        } else {
            System.out.println("Ha excedido el número de intentos máximos");
        }


    }
}
