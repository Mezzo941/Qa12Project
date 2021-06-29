package Shops;

import Products.Product;

public interface PreShop {
    public void printProductList();

    public boolean productAdd(Product product);

    public void productRemove(int id);

    public void productChange(Product product, String name, int price);
}
