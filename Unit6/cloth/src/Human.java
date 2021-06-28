import clothTypes.ClothAbilitys;

public class Human implements HumanTemplate {

    private String name;
    private ClothAbilitys jacket;
    private ClothAbilitys pants;
    private ClothAbilitys shoes;

    public Human(String name, ClothAbilitys jacket, ClothAbilitys pants, ClothAbilitys shoes) {
        this(name, jacket, pants);
        this.shoes = shoes;
    }

    public Human(String name, ClothAbilitys jacket, ClothAbilitys pants) {
        this(name, jacket);
        this.pants = pants;
    }

    public Human(String name, ClothAbilitys jacket) {
        this.name = name;
        this.jacket = jacket;
    }

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ClothAbilitys getJacket() {
        return jacket;
    }

    public ClothAbilitys getPants() {
        return pants;
    }

    public ClothAbilitys getShoes() {
        return shoes;
    }





    @Override
    public void putOnAllCloth(String jacket, String pants, String shoes) {
        this.jacket.putOn(jacket);
        this.pants.putOn(pants);
        this.shoes.putOn(shoes);
        System.out.println(name + " cейчас одел себя в " + this.jacket.getBrandName() + ", " + this.pants.getBrandName() +
                " и " + this.shoes.getBrandName());
    }

    @Override
    public void takeOffAllCloth() {
        this.jacket.takeOff();
        this.pants.takeOff();
        this.shoes.takeOff();
        System.out.println(name + " cейчас снял c себя все вещи");
    }
}
