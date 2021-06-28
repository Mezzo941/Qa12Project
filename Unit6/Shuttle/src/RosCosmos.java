import java.util.Random;

public class RosCosmos extends Shuttle implements Istart{

    private String name = "СОЮЗ-5(помойка)";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean startCheck() {
        boolean check = false;
        Random rand = new Random();
        int number = rand.nextInt(20);
        if (number <= 2) {
            check = true;
        }
        return check;
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void start() {
        super.start();
    }
}
