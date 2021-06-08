package unit1;

public class Unit1Task8 {
    public static void main(String[] args) {

        int c=3;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j<c){
                    System.out.print("  ");
                }
                else { System.out.print("* ");
                }
            }
            c--;
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i>j)
                { System.out.print("  ");
                }
                else { System.out.print("* ");}
            }
            System.out.println();
        }



        }
}