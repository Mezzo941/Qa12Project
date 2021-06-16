public class Flytransport extends Transport{
    int wingspan, runwaylength;

    public Flytransport(double power, int mass, int maxspeed, Brand brand, int wingspan, int runwaylength) {
        super(power, mass, maxspeed, brand);
        this.wingspan = wingspan;
        this.runwaylength = runwaylength;
    }
}

