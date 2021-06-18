package ClothTypes;

import ClothAbilitys.ClothAbilitys;

public class Jacket implements ClothAbilitys {

    private String brandName;

    public Jacket(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Jacket() {
    }

    @Override
    public void takeOff() {
        System.out.println("куртка " + brandName+" снята");
        brandName = " ";
    }

    @Override
    public void putOn(String brandName) {
        this.brandName = brandName;
        System.out.println("куртка " + brandName+ " надета");
    }
}
