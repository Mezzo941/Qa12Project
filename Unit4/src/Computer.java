import java.util.Scanner;

public class Computer {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        PCsettings pc1 = new PCsettings();
        pc1.WriteInfo("Core i-3 10100f", "Hyper-X fury 16GB", "WD Blue 1TB", 2);
        while (true) {
            System.out.print("Для запуска ПК введите 1 или 0: ");
            if (pc1.cycles > 0) {
                pc1.SwitchOn(s.nextInt());
            } else {
                pc1.SwitchOn(s.nextInt());
                break;
            }
        }

    }
}
