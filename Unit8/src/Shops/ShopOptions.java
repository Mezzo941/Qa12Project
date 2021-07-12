package Shops;

import Products.Product;
import java.util.ArrayList;
import java.util.Comparator;

public class ShopOptions implements PreShop {

    private final ArrayList<Product> productList = new ArrayList<>();

    public ArrayList<Product> getProductList() {
        return productList;
    }

    @Override
    public boolean hasFoundId(int id) {
        boolean result = false;
        for (Product product : productList) {
            if (product.getId() == id) {
                result = true;
                break;
            }
        }
        return result;
    }

    @Override
    public boolean productAdd(Product product) {
        boolean check = true;
        if (productList.isEmpty()) {
            productList.add(product);
        } else {
            if (hasFoundId(product.getId())) {
                check = false;
            } else productList.add(product);
        }
        return check;
    }

    @Override
    public void productRemove(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(i);
                break;
            }
        }
    }

    @Override
    public void productChange(int id, String name, int price) {
        int index = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                index = i;
                break;
            }
        }
        productList.get(index).setName(name);
        productList.get(index).setPrice(price);
    }

    @Override
    public void printProductList(ArrayList<Product> arrayList, String msg) {
        if (!arrayList.isEmpty()) {
            System.out.println("Список товаров магазина:");
            for (Product item : arrayList) {
                System.out.println(item);
            }
            System.out.println();
        } else {
            System.out.println(msg);
            System.out.println();
        }
    }

    @Override
    public void printReverseProductList(ArrayList<Product> arrayList, String msg) {
        if (!arrayList.isEmpty()) {
            System.out.println("Список товаров магазина:");
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                System.out.println(arrayList.get(i));
            }
            System.out.println();
        } else {
            System.out.println(msg);
            System.out.println();
        }
    }

    @Override
    public void productSort(ArrayList<Product> arrayList, Comparator<Product> comparator, String msg) {
        ArrayList<Product> buffProductList = new ArrayList<>(arrayList);
        buffProductList.sort(comparator);
        printProductList(buffProductList, msg);
        System.out.println();
    }
}


