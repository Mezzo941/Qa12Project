public class Unit2Task6 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5};
        byte z = 0;

        for (int i = 0; i < a.length; i++) {
            if (i < a.length - 1)
            {
                if (a[i + 1] - a[i] == 1) {z++;}
            }
            else {break;}
        }

        if (z == a.length - 1) {
            System.out.print("Прогрессия является строго арифметической");
        }
        else {System.out.print("Прогрессия не является строго арифметической");}
    }
}
