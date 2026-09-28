package unidad1;

import java.util.Scanner;

public class PostivoNegativo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un número: ");
        int n = teclado.nextInt();

        if(n>=0){
            System.out.println("El número es positivo...");
        }else{
            System.out.println("El número es negativo...");
        }
    }
}
