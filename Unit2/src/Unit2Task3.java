import java.util.Random;

public class Unit2Task3 {
    public static void main(String[] args) {

        int[] a = new int[15];
        int inc=0;
        Random rand = new Random();

        for (int i=0;i<a.length;i++){
        a[i] = rand.nextInt(99);
        System.out.print(a[i]+" ");
        }

        for (int i=0;i<a.length;i++){
            if (a[i]%2==0 && a[i]!=0) {inc++;}
        }

        System.out.println();
        System.out.println(inc);
    }
}
