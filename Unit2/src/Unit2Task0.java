import java.util.Random;
import java.util.Scanner;

public class Unit2Task0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите размер массива:_");
        int s = sc.nextInt();
        int[] a = new int[s];
        for(int i=0;i<a.length;i++){
            a[i]=rand.nextInt(10);
            System.out.print(a[i]+" ");
        }
    }
}
