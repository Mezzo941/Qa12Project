public class Transport {
    double power;
    int mass, maxspeed;
    Brand brand;

    public Transport(double power, int mass, int maxspeed, Brand brand) {
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

    void printinfo(int time) {
        System.out.println("Тип объекта: транспорт/наземный/легковой");
        System.out.println("Характеристики транспорта: ");
        System.out.println("Мощность: " + power + " л.с. или " + getPower() + " кв/ч");
        System.out.println("Масса: " + mass + " кг");
        System.out.println("Максимальная скорость: " + maxspeed + " км/ч");
        System.out.println("Производитель: " + brand);
    }


    public static void main(String[] args) {

        Litegroundtransport audi1 = new Litegroundtransport(300, 1000, 300,
                Brand.FORD, 4, 15, "coupe", 2);
        Havygroundtransport belaz1 = new Havygroundtransport(1000, 3000, 200, Brand.BELAZ, 6,
                30, 10000);
        Publicflytransport boing1 = new Publicflytransport(12000, 5000, 1000, Brand.BOING,
                30, 200, 250, false);
        Militaryflytransport stels1 = new Militaryflytransport(6000, 3000, 2500, Brand.STEALTH,
                15, 20, false, 20);



        boing1.boarding();
        stels1.shoot();
        belaz1.loading(belaz1);
        belaz1.loading(boing1);
        belaz1.loading(stels1);


        audi1.printinfo(80);


    }
}
