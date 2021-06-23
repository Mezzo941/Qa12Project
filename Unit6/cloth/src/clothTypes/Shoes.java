package clothTypes;

public class Shoes implements ClothAbilitys {
    private String brandName;

    public Shoes(String brandName) {
        this.brandName = brandName;
    }

    public Shoes() {
    }

    @Override
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String getBrandName() {
        return brandName;
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
