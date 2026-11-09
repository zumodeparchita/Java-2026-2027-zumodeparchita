package unidad1.strings;

import java.util.Scanner;

public class String5 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String texto;
        System.out.println("Introduzca un texto:");
        texto = sc.nextLine();

        for (int i = texto.length() - 1; i >= 0; i--){
            System.out.print(texto.charAt(i));
        }
    }
}
