package clothTypes;

public class Pants implements ClothAbilitys {

    private String brandName;

    public Pants(String brandName) {
        this.brandName = brandName;
    }
    public Pants() {
    }

    @Override
    public String getBrandName() {
        return brandName;
    }

    @Override
    public void setBrandName(String brandName) {
        this.brandName = brandName;
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
