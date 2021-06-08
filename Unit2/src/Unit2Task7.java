import java.util.Random;

public class Unit2Task7 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[12];
        int index = 0, max = 0;

        for (int i=0;i<a.length;i++){
            a[i]=rand.nextInt(15);
            System.out.print(a[i]+" ");
        }

        System.out.println();

        for (int i=0;i<a.length;i++){
            if (a[i]>=max) {max=a[i]; index=i;}
        }

        System.out.println("Максимальный элемент массива = "+max);
        System.out.println("Индекс последнего вхождения элемента в массив = "+index);
    }
}
