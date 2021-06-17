package by.teachmeskills.robot.hands;

public class SamsungHand implements IHand{

    public SamsungHand(int price) {
        this.price = price;
    }

    public SamsungHand() {
    }

    private int price;

    @Override
    public void upHand() {
        System.out.println("Поднять руку Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
