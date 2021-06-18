import ClothTypes.Jacket;
import ClothTypes.Pants;
import ClothTypes.Shoes;

public class Run {
    public static void main(String[] args) {
        Human human1 = new Human("Леха",new Jacket("стоун айленд"),new Pants("левики"),
                new Shoes("98 эиры"));
        human1.getJacket().takeOff();
        human1.getJacket().putOn("томми хелфигер");
        human1.putOnAllCloth("Lee","versace","gucci");
        human1.takeOffAllCloth();
        System.out.println(human1.getName());
        System.out.println(human1.getJacket().getBrandName());
        System.out.println(human1.getPants().getBrandName());
        System.out.println(human1.getShoes().getBrandName());

    }
}
