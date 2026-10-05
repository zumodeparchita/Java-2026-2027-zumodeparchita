package unidad1;

import java.util.Scanner;

public class MultiplosDe3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0, acum = 0, cont = 0;

        System.out.println("Ingrese un número");
        num = sc.nextInt();

        for (int i = 3; i < num; i+=3) {

            System.out.println(i + " Es múltiplo de 3 \nAcumulado " + acum);
            acum += i;
            cont++;
        }
        System.out.println("Del 1 al " + num + " hay " + cont + " múltiplos de 3");
    }
}
