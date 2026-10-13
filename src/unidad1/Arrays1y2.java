package unidad1;

public class Arrays1y2 {
    public static void main (String[] args)  {

        int [] numeros = new int[12];

        numeros[0] = 39;
        numeros[1] = -2;
        numeros[4] = 0;
        numeros[6] = 14;
        numeros[8] = 5;
        numeros[9] = 120;

        for (int numero : numeros) {
            System.out.println(numero);
        }

        char[] simbolos = new char[10];

        simbolos[0] = 'a';
        simbolos[1] = 'x';
        simbolos[4] = '@';
        simbolos[6] = ' ';
        simbolos[7] = '+';
        simbolos[8] = 'Q';

        for (char simbolo : simbolos) {
            System.out.println("[" + simbolo + "]");
        }
        }
    }



