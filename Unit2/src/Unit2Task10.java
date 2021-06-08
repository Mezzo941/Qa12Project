import java.util.Random;
import java.util.Scanner;

public class Unit2Task10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        while (true) {

            System.out.print("Введите число > 3 ");
            int n = Math.abs(sc.nextInt());
            if (n < 3) {
                System.out.println("Вы ввели неверное значение.");
            }
            else {
                int[] a = new int[n];
                int[] b = new int[n];

                for (int i = 0; i < n; i++) {
                    a[i] = r.nextInt(n);
                    System.out.print(a[i] + " ");
                }

                System.out.println();

                for (int i = 0; i < n; i++) {
                    if (a[i] % 2 == 0 && a[i] != 0) {
                        b[i] = a[i];
                        System.out.print(b[i] + " ");
                    }
                }
                System.out.println();
            }

        }

    }
}
