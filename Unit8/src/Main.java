import Products.Product;
import Shops.Shop;

public class Main {
    public static void main(String[] args) {
        Shop adidasShop = new Shop();
        System.out.println(adidasShop.productAdd(new Product(0, "Yezee boost", 190)));
        System.out.println(adidasShop.productAdd(new Product(1, "Nike airmax 98", 150)));
        System.out.println(adidasShop.productAdd(new Product(2, "Nike airmax 98", 150)));
        System.out.println(adidasShop.productAdd(new Product(3, "NB 990 v4", 230)));
        /*System.out.println(adidasShop.productAdd(new Product(2, "NB 990 v4", 230)));*/
        adidasShop.printProductList();
        System.out.println();
        adidasShop.productChange(adidasShop.getProductList().get(0),"Asics",100);
        System.out.println(adidasShop.productAdd(new Product(0, "Yezee boost", 190)));
        adidasShop.printProductList();


    }
}
