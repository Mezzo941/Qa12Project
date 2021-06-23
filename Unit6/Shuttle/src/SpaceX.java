import java.util.Random;

public class SpaceX extends Shuttle implements Istart{

    private String name = "Falcon";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean startCheck() {
        boolean check = true;
        Random rand = new Random();
        int number = rand.nextInt(10);
        if (number <= 1) {
            check = false;
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
