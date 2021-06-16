public class Litegroundtransport extends Groundtansport {
    String body;
    int passengercount;

    public Litegroundtransport(double power, int mass, int maxspeed, String brand, int wheelcount, int fuel, String body, int passengercount) {
        super(power, mass, maxspeed, brand, wheelcount, fuel);
        this.body = body;
        this.passengercount = passengercount;
    }

    private double fuelspend(int time) {
        return distanceCalc(time) / 100 * fuel;
    }

    void printinfo(int time) {
        System.out.println("Тип объекта: транспорт/наземный/легковой");
        System.out.println("Характеристики транспорта: ");
        System.out.println("Мощность: " + power + " л.с. или " + getPower() + " кв/ч");
        System.out.println("Масса: " + mass + " кг");
        System.out.println("Максимальная скорость: " + maxspeed + " км/ч");
        System.out.println("Производитель: " + brand);
        System.out.println("Количество колес: " + wheelcount);
        System.out.println("Расход топлива: " + fuel + " л/100км");
        System.out.println("Тип кузова: " + body);
        System.out.println("Количество пассажиров " + passengercount);
        System.out.println("За " + time / 60 + " ч. автомобиль " + brand + ", двигаясь с макс. скоростью " + maxspeed +
                " км/ч проедет " + distanceCalc(time) + " км и израсходует " + fuelspend(time) + " л. топлива");
    }
}


