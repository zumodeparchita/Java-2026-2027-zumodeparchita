package unidad1;

import java.util.Scanner;

public class EscribirAstericos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String asterisco = "*";
        int n = 0;

        System.out.println("Indique cuántos asteríscos se deben escribir");
        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print(asterisco);
        }
    }
}
