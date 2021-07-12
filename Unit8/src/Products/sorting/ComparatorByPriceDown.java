package Products.sorting;

import Products.Product;

import java.util.Comparator;

public class ComparatorByPriceDown implements Comparator <Product>{
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice()-o1.getPrice();
    }
}