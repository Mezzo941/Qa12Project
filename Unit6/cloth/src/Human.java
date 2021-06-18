import ClothTypes.Jacket;
import ClothTypes.Pants;
import ClothTypes.Shoes;

public class Human {

    private String name;
    private Jacket jacket;
    private Pants pants;
    private Shoes shoes;

    public String getName() {
        return name;
    }

    public Jacket getJacket() {
        return jacket;
    }

    public Pants getPants() {
        return pants;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public Human(String name, Jacket jacket, Pants pants, Shoes shoes) {
        this(name, jacket, pants);
        this.shoes = shoes;
    }

    public Human(String name, Jacket jacket, Pants pants) {
        this(name, jacket);
        this.pants = pants;
    }

    public Human(String name, Jacket jacket) {
        this.name = name;
        this.jacket = jacket;
    }

    public Human(String name) {
        this.name = name;
    }

    public void putOnAllCloth(String pants, String jacket, String shoes) {
        this.pants.putOn(pants);
        this.jacket.putOn(jacket);
        this.shoes.putOn(shoes);
        System.out.println(name + " cейчас одел себя в " + this.jacket.getBrandName() + ", " + this.pants.getBrandName() +
                " и " + this.shoes.getBrandName());
    }

    public void takeOffAllCloth() {
        this.pants.setBrandName(" ");
        this.jacket.setBrandName(" ");
        this.shoes.setBrandName(" ");
        System.out.println(name + " cейчас снял c себя все вещи");
    }


}
