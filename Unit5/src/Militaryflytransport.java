public class Militaryflytransport extends Flytransport {
    boolean jump;
    int rocketcount;

    public Militaryflytransport(double power, int mass, int maxspeed, String brand, int wingspan, int runwaylength,
                                boolean jump, int rocketcount) {
        super(power, mass, maxspeed, brand, wingspan, runwaylength);
        this.jump = jump;
        this.rocketcount = rocketcount;
    }

    void shoot() {
        while (true) {
            if (rocketcount > 0) {
                System.out.println("Ракета пошла! " + "Ракет осталось: " + rocketcount);
                rocketcount--;
            }
            if (rocketcount == 0) {
                System.out.println("Боеприпасы отсутствуют");
                break;
            }
        }
    }

    void bailout() {
        if (jump == true) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }

    void printinfo() {
        System.out.println("Тип объекта: транспорт/воздушный/военный");
        System.out.println("Характеристики транспорта: ");
        System.out.println("Мощность: " + power + " л.с. или " + getPower() + " кв/ч");
        System.out.println("Масса: " + mass + " кг");
        System.out.println("Максимальная скорость: " + maxspeed + " км/ч");
        System.out.println("Производитель: " + brand);
        System.out.println("Рахмах крыльев: " + wingspan + " м");
        System.out.println("Мин. длина полосы для взлета: " + runwaylength + " м");
        if (jump == true) {
            System.out.println("Есть возможность катапультироваться");
        } else {
            System.out.println("Нет возможности катапультироваться");
        }
        System.out.println("Кол-во ракет в арсенале: " + rocketcount);
    }
}
