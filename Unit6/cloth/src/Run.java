import clothTypes.Jacket;
import clothTypes.Pants;
import clothTypes.Shoes;

public class Run {
    public static void main(String[] args) {
        Human human1 = new Human("Леха",new Jacket("Tommy Helfiger"),new Pants("Levi's"),
                new Shoes("airmax 98"));

        System.out.println(human1.getJacket().getBrandName()+human1.getPants().getBrandName()+human1.getShoes().getBrandName());
        human1.takeOffAllCloth();
        human1.putOnAllCloth("мастерка","трейники","туфли");
        System.out.println(human1.getJacket().getBrandName()+human1.getPants().getBrandName()+human1.getShoes().getBrandName());
    }
}
