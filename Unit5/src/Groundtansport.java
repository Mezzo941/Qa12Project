public class Groundtansport extends Transport{
    int wheelcount,fuel;

    public Groundtansport(double power, int mass, int maxspeed, String brand, int wheelcount, int fuel) {
        super(power, mass, maxspeed, brand);
        this.wheelcount = wheelcount;
        this.fuel = fuel;
    }
}

