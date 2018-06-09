package com.gpteam.java_learning;

import com.gpteam.java_learning.product_inventory.Inventory;
import com.gpteam.java_learning.product_inventory.Product;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String wybor;

        System.out.println("Wybierz appke: ");
        System.out.println("1. Product Inventory");
        System.out.println("0. Wyjscie.");

        while(true) {
            wybor = in.next();

            if (wybor.equals("1")) {
                System.out.println("in productInventory.");
                productInventory();
            }

            else if(wybor.equals("0")) {
                System.out.println("exiting.");
                System.exit(0);
            }

            else {
                System.out.println("Zly input.");
            }
        }
    }

    static void productInventory() {
        Inventory inventory = new Inventory();
        Product jablko = new Product("Jablko", 5, 1);
        Product gruszka = new Product("Gruszka", 3, 2);

        inventory.putProduct(jablko);
        inventory.putProduct(gruszka);
        inventory.print();
    }
}
