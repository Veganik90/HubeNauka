package com.gpteam.java_learning.product_inventory;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products;
    private boolean initialized = false;

    public Inventory() {
        if (!initialized) {
            initialize();
            initialized = true;
        }
    }

    public void initialize() {
        products = new ArrayList<Product>();
    }

    public void putProduct(Product product) {
        products.add(product);
    }

    public void print() {
        for (int i = 0; i < products.size(); i++) {
            getProductInfo(i);
        }
    }

    private void getProductInfo(int index) {
        System.out.println(products.get(index).getNazwa() + " cena: " +
        products.get(index).getCena() + " ilosc w magazynie: " +
        products.get(index).getQuantity());
    }
}