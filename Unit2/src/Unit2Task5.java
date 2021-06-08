import java.util.Random;

public class Unit2Task5 {
    public static void main(String[] args) {
        int[]  a = new int[5];
        int[]  b = new int[5];
        double ma=0,mb=0;
        Random rand = new Random();

        for(int i=0;i<5;i++){
            a[i]=rand.nextInt(15);
            b[i]=rand.nextInt(15);
            ma+=a[i];
            mb+=b[i];
        }

        for(int i=0;i<5;i++){
            System.out.print(a[i]+" ");
        }

        System.out.println();

        for(int i=0;i<5;i++){
            System.out.print(b[i]+" ");
        }

        System.out.println();
        System.out.println("Сумма элементов массива а = "+ ma);
        System.out.println("Сумма элементов массива b = "+ mb);
        System.out.println();

        if (ma/5>mb/5) {
            System.out.println("Ср.а. элементов массива а больше, чем у массива b");
        }
        if (ma/5<mb/5){System.out.println("Ср.а. элементов массива b больше, чем у массива a");
        }
        if (ma/5==mb/5){System.out.println("Ср.а. элементов массивов a и b равны");
        }

    }
}
