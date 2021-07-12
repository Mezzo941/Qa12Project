package Shops;

import Products.Product;

import java.util.ArrayList;
import java.util.Comparator;

public interface PreShop {
    void printProductList(ArrayList<Product> arrayList, String msg);

    void printReverseProductList(ArrayList<Product> arrayList, String msg);

    void productRemove(int id);

    void productChange(int id, String name, int price);

    boolean productAdd(Product product);

    boolean hasFoundId(int id);

    void productSort(ArrayList<Product> arrayList, Comparator<Product> comparator, String msg);
}
