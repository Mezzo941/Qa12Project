import java.util.Random;

public class Shuttle implements Istart {


    private String name = "Какой-то шатл";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean startCheck() {
        boolean check = true;
        Random rand = new Random();
        int number = rand.nextInt(10);
        if (number <= 3) {
            check = false;
        }
        return check;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println(getName() + " взлетает!");
        System.out.println();
    }
}
