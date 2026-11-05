package unidad1;

import java.util.Scanner;

public class String1 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String s;
        System.out.println("Introduce un texto");
        s = sc.nextLine();

        for(int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }
    }
}
