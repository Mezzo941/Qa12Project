import java.util.Random;
import java.util.Scanner;

public class Unit2Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Введите размер массива: ");
        int s = Math.abs(sc.nextInt());
        int[] a = new int[s];
        int indexleft = 0, indexright = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(15);
            System.out.print(a[i] + " ");
        }

        int buffindex = 0;

        if (s % 2 == 1) {
            for (int i = 0; i < (s - 1) / 2; i++) {
                indexleft += a[i];
                buffindex = i;
            }
            for (int i = buffindex + 2; i < s; i++) {
                indexright += a[i];
            }
        } else {
            for (int i = 0; i < s / 2; i++) {
                indexleft += a[i];
                buffindex = i;
            }
            for (int i = buffindex + 1; i < s; i++) {
                indexright += a[i];
            }
        }

        System.out.println();
        System.out.println(indexleft + " " + indexright);

        if (indexleft > indexright) {
            System.out.print("Левая сторона массива больше, чем правая");
        }
        if (indexright > indexleft) {
            System.out.print("Правая сторона массива больше, чем левая");
        }
        if (indexleft == indexright) {
            System.out.print("Обе стороны массива равны");
        }

    }
}
