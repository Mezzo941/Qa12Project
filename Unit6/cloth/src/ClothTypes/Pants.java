package ClothTypes;

import ClothAbilitys.ClothAbilitys;

public class Pants implements ClothAbilitys {

    private String brandName;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Pants(String brandName) {
        this.brandName = brandName;
    }

    public Pants() {
    }

    @Override
    public void takeOff() {
        System.out.println("Штаны " + brandName + " сняты");
        setBrandName(" ");
    }

    @Override
    public void putOn(String brandName) {
        setBrandName(brandName);
        System.out.println("Штаны " + brandName + " надеты");
    }
}
