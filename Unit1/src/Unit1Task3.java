package unit1;

public class Unit1Task3 {
    public static void main(String[] args) {
        int s = 1, rez = 0;
        while (s <= 256) {
            if (s <= 256) {
                System.out.print(s + "+");
                rez += s;
                s *= 2;
            } else {
                System.out.print(s);
                break;
            }
        }
        System.out.println();
        System.out.println(rez);
    }
}

