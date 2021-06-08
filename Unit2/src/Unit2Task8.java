import java.util.Random;

public class Unit2Task8 {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] a = new int[10];
        int[] b = new int[10];
        double[] c = new double[10];

        for (int i=0;i<10;i++){
            a[i]=rand.nextInt(9);
            b[i]=rand.nextInt(9);
            System.out.print(a[i]+" ");
        }

        System.out.println();

        for (int i=0;i<10;i++){
            System.out.print(b[i]+" ");
        }

        System.out.println();

        int index=0;

        for (int i=0;i<10;i++){
            if (b[i]==0) {System.out.print(a[i]+":"+b[i]+" - на ноль делить нельзя ");}
            else
            {
                if (a[i]%b[i]==0) {index++; c[i]=(double)a[i]/b[i]; System.out.print(c[i]+"("+a[i]+":"+b[i]+")"+" ");}
                else {c[i]=(double)a[i]/b[i]; System.out.print(c[i]+"("+a[i]+":"+b[i]+")"+" ");}
            }
        }

        System.out.println();
        System.out.println("Количество целых чисел в массиве с = " + index);
    }
}
