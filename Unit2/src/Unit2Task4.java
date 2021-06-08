import java.util.Random;

public class Unit2Task4 {
    public static void main(String[] args) {

        int[] a = new int[20];
        Random rand = new Random();

        for (int i=0;i<a.length;i++){
            a[i] = rand.nextInt(20);
            System.out.print(a[i]+" ");
            if (a[i]%2==0 && a[i]!=0) {a[i]=0;}
        }

        System.out.println();

        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
