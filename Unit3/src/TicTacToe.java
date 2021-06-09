import java.util.Scanner;

public class TicTacToe {
    public TicTacToe() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] field = new int[][]{{8, 8, 8}, {8, 8, 8}, {8, 8, 8}};
        boolean gamerez = false;

        for(int a = 0; a < 9 && !gamerez; ++a) {
            System.out.print("Введите i: ");
            int q = sc.nextInt();
            System.out.print("Введите j: ");
            int w = sc.nextInt();
            System.out.print("Введите x или 0: ");
            field[q][w] = sc.nextInt();

            int zcheck;
            int ccheck;
            for(zcheck = 0; zcheck < 3; ++zcheck) {
                for(ccheck = 0; ccheck < 3; ++ccheck) {
                    System.out.print(field[zcheck][ccheck] + " ");
                }

                System.out.println();
            }

            int j;
            int i;
            for(zcheck = 0; zcheck < 3; ++zcheck) {
                ccheck = 0;
                j = 0;

                for(i = 0; i < 3; ++i) {
                    if (field[zcheck][i] == 0) {
                        ++ccheck;
                    }

                    if (field[zcheck][i] == 1) {
                        ++j;
                    }
                }

                if (ccheck == 3) {
                    System.out.print("0 the winner!");
                    gamerez = true;
                    break;
                }

                if (j == 3) {
                    System.out.print("X the winner!");
                    gamerez = true;
                    break;
                }
            }

            for(zcheck = 0; zcheck < 3; ++zcheck) {
                ccheck = 0;
                j = 0;

                for(i = 0; i < 3; ++i) {
                    if (field[i][zcheck] == 0) {
                        ++ccheck;
                    }

                    if (field[i][zcheck] == 1) {
                        ++j;
                    }
                }

                if (ccheck == 3) {
                    System.out.print("0 the winner!");
                    gamerez = true;
                    break;
                }

                if (j == 3) {
                    System.out.print("X the winner!");
                    gamerez = true;
                    break;
                }
            }

            zcheck = 0;
            ccheck = 0;

            for(j = 0; j < 3; ++j) {
                if (field[j][j] == 0) {
                    ++zcheck;
                }

                if (field[j][j] == 1) {
                    ++ccheck;
                }

                if (zcheck == 3) {
                    System.out.print("0 the winner!");
                    gamerez = true;
                }

                if (ccheck == 3) {
                    System.out.print("X the winner!");
                    gamerez = true;
                }
            }

            zcheck = 0;
            ccheck = 0;
            j = 2;

            for(i = 0; i < 3; ++i) {
                if (field[i][j] == 0) {
                    ++zcheck;
                }

                if (field[i][j] == 1) {
                    ++ccheck;
                }

                --j;
                if (zcheck == 3) {
                    System.out.print("0 the winner!");
                    gamerez = true;
                }

                if (ccheck == 3) {
                    System.out.print("X the winner!");
                    gamerez = true;
                }
            }

            System.out.println();
        }

    }
}
