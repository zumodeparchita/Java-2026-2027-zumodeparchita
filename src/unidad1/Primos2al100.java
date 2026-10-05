package unidad1;

public class Primos2al100 {
    public static void main(String[] args) {


        for (int num = 1; num <= 100; num++) {

            int i = 2;
            while (i < num && num % i != 0){
                i++;
            }
            if (i == num) {
                System.out.println(num + "Es primo");
            } else {
                System.out.println(num + "No es primo");
            }
        }
    }
}
