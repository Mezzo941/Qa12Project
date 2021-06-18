public class Publicflytransport extends Flytransport {
    int passengercount;
    boolean businessclass;

    public Publicflytransport(double power, int mass, int maxspeed, Brand brand, int wingspan, int runwaylength, int passengercount, boolean businessclass) {
        super(power, mass, maxspeed, brand, wingspan, runwaylength);
        this.passengercount = passengercount;
        this.businessclass = businessclass;
    }

    void boarding() {
        int seet = 0;
        while (seet != passengercount) {
            if (seet != passengercount) {
                seet++;
                System.out.println("Пассажир занял место. Номер места пассажира: "+seet);
            }
            if (seet == passengercount) {
                System.out.println("Все пассажиры заняли свои места ");
            }
        }
    }

    void printinfo() {
        System.out.println("Тип объекта: транспорт/воздушный/общественный");
        System.out.println("Характеристики транспорта: ");
        System.out.println("Мощность: " + power + " л.с. или " + getPower() + " кв/ч");
        System.out.println("Масса: " + mass + " кг");
        System.out.println("Максимальная скорость: " + maxspeed + " км/ч");
        System.out.println("Производитель: " + brand);
        System.out.println("Рахмах крыльев: " + wingspan + " м");
        System.out.println("Мин. длина полосы для взлета: " + runwaylength + " м");
        System.out.println("Количество пассажиров:  " + passengercount);
        if (businessclass == true) {
            System.out.println("Бизнесскласс");
        } else {
            System.out.println("Экономкласс");
        }
    }

}

