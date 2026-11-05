package unidad1;

import java.util.Scanner;

public class String8 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String frase;
        System.out.println("Ingrese una frase: ");
        frase = sc.nextLine().trim();
        String [] palabras = frase.split("\\s+");
        String resultado = "";


        for (String palabra : palabras) {
            resultado = resultado.concat(" " + palabra
                    .substring(0, 1)
                    .toUpperCase()
                    .concat(palabra
                            .substring(1)
                            .toLowerCase()));
        }
        System.out.println(resultado.trim());
    }
}
