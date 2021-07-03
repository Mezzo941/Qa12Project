package Shops;

import Products.Product;

public interface PreShop {
    void printProductList(String msg);

    void productRemove(int id);

    void productChange(int id, String name, int price);

    boolean productAdd(Product product);

    boolean hasFoundId(int id);
}
