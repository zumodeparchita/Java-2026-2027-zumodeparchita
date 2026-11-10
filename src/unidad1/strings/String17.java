package unidad1.strings;

import java.util.Scanner;

public class String17 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String abecedario = "abcdefghijklmnopqrstuvwxyz";
        String texto, textoCifrado = "";
        int desplazamiento, pos;

        System.out.println("Introduce el texto a cifrar: ");
        texto = sc.nextLine().toLowerCase().replace(" ", "");

        System.out.println("Introduce el desplazamiento César: ");
        desplazamiento = sc.nextInt();

        for(int i = 0; i < texto.length(); i++){
            pos = abecedario.indexOf(texto.charAt(i));
            pos = (pos + desplazamiento) % abecedario.length();
            textoCifrado += abecedario.charAt(pos);
        }

        System.out.println("Texto cifrado: " + textoCifrado);
    }
}
