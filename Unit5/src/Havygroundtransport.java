import java.lang.annotation.Target;

public class Havygroundtransport extends Groundtansport {
    int lift;

    public Havygroundtransport(double power, int mass, int maxspeed, String brand, int wheelcount, int fuel, int lift) {
        super(power, mass, maxspeed, brand, wheelcount, fuel);
        this.lift = lift;
    }

    void loading(Transport obj) {
        if (obj.mass < lift) {
            System.out.println(obj.brand + " успешно загружен");
            lift -= obj.mass;
        }
        else if (obj.mass>lift) {
            System.out.println("Загрузить " +obj.brand +" не получилось. Нужен грузовик побольше");
        }
    }

    void printinfo() {
        System.out.println("Тип объекта: транспорт/наземный/грузовой");
        System.out.println("Характеристики транспорта: ");
        System.out.println("Мощность: " + power + " л.с. или " + getPower() + " кв/ч");
        System.out.println("Масса: " + mass + " кг");
        System.out.println("Максимальная скорость: " + maxspeed + " км/ч");
        System.out.println("Производитель: " + brand);
        System.out.println("Количество колес: " + wheelcount);
        System.out.println("Расход топлива: " + fuel + " л/100км");
        System.out.println("Грузоподъемность: " + lift + " тонн");
    }
}

