package Shops;

import Products.Product;

import java.util.ArrayList;
import java.util.Collection;

public class Shop implements PreShop {

    private ArrayList<Product> productList = new ArrayList<>();

    public ArrayList<Product> getProductList() {
        return productList;
    }


    @Override
    public boolean productAdd(Product product) {
        boolean check = true;
        if (productList.isEmpty()) {
            productList.add(product);
        } else {
            for (int i = 0; i < productList.size(); i++) {
                if (productList.get(i).getId() == product.getId()) {
                    check = false;
                    break;
                }
            }
            if (check) {
                productList.add(product);
            }
        }
        return check;
    }

    @Override
    public void productRemove(int id) {
        productList.remove(id);
    }

    @Override
    public void productChange(Product product, String name, int price) {
        product.setName(name);
        product.setPrice(price);
    }

    @Override
    public void printProductList() {
        for (Product p : productList) {
            System.out.println(p);
        }
    }

}


