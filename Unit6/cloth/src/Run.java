import ClothTypes.Jacket;
import ClothTypes.Pants;
import ClothTypes.Shoes;

public class Run {
    public static void main(String[] args) {
        Human human1 = new Human("Леха", new Jacket("стоун айленд"), new Pants("левики"),
                new Shoes("98 эиры"));
        Human human2 = new Human("Саня", new Jacket("купалинка"), new Pants("adidas"),
                new Shoes("макасины"));
        human1.getJacket().takeOff();
        human1.getJacket().putOn("томми хелфигер");
        human1.putOnAllCloth("Lee", "versace", "gucci");
        human1.takeOffAllCloth();
        human2.takeOffAllCloth();
        human1.getJacket().putOn(human2.getJacket().getBrandName());
        System.out.println(human2.getJacket().getBrandName());
        System.out.println(human2.getPants().getBrandName());
        System.out.println(human2.getShoes().getBrandName());
    }
}
