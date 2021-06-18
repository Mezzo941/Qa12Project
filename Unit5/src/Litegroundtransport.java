public class Litegroundtransport extends Groundtansport {
    String body;
    int passengercount;

    public Litegroundtransport(double power, int mass, int maxspeed, Brand brand, int wheelcount, int fuel, String body, int passengercount) {
        super(power, mass, maxspeed, brand, wheelcount, fuel);
        this.body = body;
        this.passengercount = passengercount;
    }

    private double fuelspend(int time) {
        return distanceCalc(time) / 100 * fuel;
    }

    @Override
    void printinfo(int time) {
        super.printinfo(time);
        System.out.println("Тип кузова: " + body);
        System.out.println("Количество пассажиров " + passengercount);
        System.out.println("За " + time / 60 + " ч. автомобиль " + brand + ", двигаясь с макс. скоростью " + maxspeed +
                " км/ч проедет " + distanceCalc(time) + " км и израсходует " + fuelspend(time) + " л. топлива");
    }
}


