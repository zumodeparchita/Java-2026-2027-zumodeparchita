package unidad1;

import java.util.Arrays;

public class Arrays14 {
    public static void main(String[] args) {
        int [] enteros = new int[55];
        int pos = 0;
        int num = 1;

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < num; j++){
                enteros[pos] = num;
                pos++;
            }
            num++;
        }
        System.out.println(Arrays.toString(enteros));
    }
}
