package ClothTypes;


public class Jacket implements ClothAbilitys {

    private String brandName;

    public Jacket(String brandName) {
        this.brandName = brandName;
    }

    public Jacket() {
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
        System.out.println("куртка " + brandName + " снята");
        setBrandName(" ");
    }

    @Override
    public void putOn(String brandName) {
        setBrandName(brandName);
        System.out.println("куртка " + brandName + " надета");
    }
}
