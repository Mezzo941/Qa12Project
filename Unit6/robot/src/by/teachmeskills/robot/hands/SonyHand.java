package by.teachmeskills.robot.hands;

public class SonyHand implements IHand {

    public SonyHand(int price) {
        this.price = price;
    }

    public SonyHand() {
    }

    private int price;

    @Override
    public void upHand() {
        System.out.println("Рука Sony поднялась");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
