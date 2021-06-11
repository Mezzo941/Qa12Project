import java.util.Random;

public class PCsettings {
    String stone;
    String ram;
    String hdd;
    int cycles;

    public void WriteInfo(String stone, String ram, String hdd, int cycles) {
        this.stone = stone;
        this.ram = ram;
        this.hdd = hdd;
        this.cycles = cycles;
    }

    public void PrintInfo() {
        System.out.println("PC settings now are: ");
        System.out.println("Processor: " + stone);
        System.out.println("RAM : " + ram);
        System.out.println("hdd: " + hdd);
        System.out.println("Cycles count: " + cycles);
        System.out.println("Loading...");
    }

    public void SwitchOn(int a) {
        Random r = new Random();
        int b = r.nextInt(2);
        if (cycles > 0) {
            if (a == b) {
                System.out.println("ПК успешно стартанул");
                PrintInfo();
            } else {
                System.out.println("ПК не включается");
                cycles--;
                System.out.println("Cycles count: " + cycles);
            }
        } else {
            System.out.println("ПК сгорел");
        }
    }
}

