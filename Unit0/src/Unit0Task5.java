public class Unit0Task5 {
        public static void main(String[] args) {

            int a = -1, b = -1, c = -1;
            if ((a > 0 && b <= 0 && c <= 0) || (a <= 0 && b > 0 && c <= 0) || ((a <= 0 && b <= 0 && c > 0))) {
                System.out.print(" 1 положительное число ");
            } else if ((a > 0 && b > 0 && c <= 0) || (a > 0 && b <= 0 && c > 0) || ((a <= 0 && b > 0 && c > 0))) {
                System.out.print(" 2 положительных числа ");
            } else if (a > 0 && b > 0 && c > 0) {
                System.out.print("3 положительных числа ");
            } else {
                System.out.print("положительных чисел нет ");
            }


            if ((a < 0 && b >= 0 && c >= 0) || (a >= 0 && b < 0 && c >= 0) || ((a >= 0 && b >= 0 && c < 0))) {
                System.out.println("1 отрицательное число");
            } else if ((a < 0 && b < 0 && c >= 0) || (a < 0 && b >= 0 && c < 0) || ( a>= 0 && b < 0 && c < 0)) {
                System.out.println("2 отрицательных числа");
            } else if (a < 0 && b < 0 && c < 0) {
                System.out.println("3 отрицательных числа");
            } else {
                System.out.println("отрицательных чисел нет");
            }

        }
    }

