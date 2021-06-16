public class Transport {
    double power;
    int mass, maxspeed;
    String brand;

    public Transport(double power, int mass, int maxspeed, String brand) {
        this.power = power;
        this.mass = mass;
        this.maxspeed = maxspeed;
        this.brand = brand;
    }

    double getPower() {
        return power * 0.74;
    }

    double distanceCalc(int v) { //данный метод было бы логично вынести в родитель
        return v / 60 * maxspeed;
    }


    public static void main(String[] args) {

        Litegroundtransport audi1 = new Litegroundtransport(300, 1000, 300,
                "audi", 4, 15, "coupe", 2);
        Havygroundtransport belaz1 = new Havygroundtransport(1000, 3000, 200, "Belaz", 6,
                30, 10000);
        Publicflytransport boing1 = new Publicflytransport(12000, 5000, 1000, "Boing",
                30, 200, 250, false);
        Militaryflytransport stels1 = new Militaryflytransport(6000, 3000, 2500, "Stels",
                15, 20, false, 20);

        /*
        audi1.printinfo(80);
        belaz1.loading(belaz1);
        belaz1.loading(boing1);
        belaz1.loading(stels1);
        boing1.boarding();
        stels1.shoot();
        */

    }
}
