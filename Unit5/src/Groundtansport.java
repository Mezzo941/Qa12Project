public class Groundtansport extends Transport{
    int wheelcount;
    int fuel;

    public Groundtansport(double power, int mass, int maxspeed, Brand brand, int wheelcount, int fuel) {
        super(power, mass, maxspeed, brand);
        this.wheelcount = wheelcount;
        this.fuel = fuel;
    }

    @Override
    void printinfo(int time) {
        super.printinfo(time);
        System.out.println("Количество колес: " + wheelcount);
        System.out.println("Расход топлива: " + fuel + " л/100км");
    }
}

