package unidad1;

public class Multiplos5 {
    public static void main (String[] args){
        for (int i = 5; i <= 100; i+=5){
            System.out.println(i + " es múltiplo de 5 (for)");
        }
        int j = 5;

        while(j <= 100) {
            System.out.println(j + " es múltiplo de 5 (while)");
            j+=5;
        }
        int k = 5;
        do{
            System.out.println(k + " es múltiplo de 5 (do-while)");
            k+=5;
        } while (k <= 100);

    }
}
