package unidad1;

import java.util.Scanner;

public class String2 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String texto1, texto2;

        System.out.println("Introduce un texto: ");
        texto1 = sc.nextLine();
        System.out.println("Introduce otro texto: ");
        texto2 = sc.nextLine();

        if (texto1.equals(texto2)) {
            System.out.println("Son iguales y están escritos igual.");
        } else if (texto1.equalsIgnoreCase(texto2)){
            System.out.println("Son iguales pero están escritos diferente.");
        } else {
            System.out.println("Son diferentes.");
        }
    }
}
