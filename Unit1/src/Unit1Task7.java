package unit1;

public class Unit1Task7 {
    public static void main(String[] args) {
        int inc=0;
        for (int i = 1; i < 100; i++) {
            if (i%2==1){
                inc+=i;
            }
        }
        System.out.print(inc);
    }
}
