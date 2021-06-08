import java.util.Scanner;

public class Unit0Task8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое значение: ");
        int a = in.nextInt();
        System.out.print("Введите второе значение: ");
        int b = in.nextInt();

        if (a>b){ System.out.println(a + " больше т.к. "+a+" > "+b);
        }
        if (a<b) {
            System.out.println(b+ " больше т.к. " + b + " > " + a);
        }
        if (a==b) { System.out.println("Значения равны т.к. "+a+" = "+b);}
    }
}
