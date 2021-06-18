package ClothTypes;

import ClothAbilitys.ClothAbilitys;

public class Shoes implements ClothAbilitys {
    private String brandName;

    public Shoes(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Shoes() {
    }

    @Override
    public void takeOff() {
        System.out.println("обувь " + brandName + " снята");
        setBrandName(" ");
    }

    @Override
    public void putOn(String brandName) {
        setBrandName(brandName);
        System.out.println("обувь " + brandName + " надета");
    }
}
