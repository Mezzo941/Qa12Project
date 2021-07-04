package Products.sorting;

import Products.Product;

import java.util.Comparator;

public class ComparatorByPriceUp implements Comparator <Product>{
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice()-o2.getPrice();
    }
}