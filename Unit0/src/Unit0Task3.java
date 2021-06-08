public class Unit0Task3 {
    public static void main(String[] args) {

        int a = 1, b = 0, c = 2;
        if ((a > 0 && b <= 0 && c <= 0) || (a <= 0 && b > 0 && c <= 0) || ((a <= 0 && b <= 0 && c > 0))) {
            System.out.println("1 положительное число");
        } else if ((a > 0 && b > 0 && c <= 0) || (a > 0 && b <= 0 && c > 0) || ((a <= 0 && b > 0 && c > 0))) {
            System.out.println("2 положительных числа");
        } else if (a > 0 && b > 0 && c > 0) {
            System.out.println("3 положительных числа");
        } else {
            System.out.println("положительных чисел нет");
        }

    }
}
