package Shops;

import Products.Product;

import java.util.ArrayList;

public class Shop implements PreShop {

    private ArrayList<Product> productList = new ArrayList<>();

    public ArrayList<Product> getProductList() {
        return productList;
    }

    @Override
    public boolean hasFoundId(int id) {
        boolean result = false;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
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
            if (hasFoundId(product.getId())){
                check = false;
            }
            else productList.add(product);
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
    public void printProductList() {
        System.out.println("Список товаров магазина:");
        for (Product p : productList) {
            System.out.println(p);
        }
    }

    public void printWithoutSort(String msg) {
        if (productList.isEmpty()) {
            System.out.println();
            System.out.println(msg);
            System.out.println();
        } else {
            System.out.println();
            printProductList();
            System.out.println();
        }
    }

}


