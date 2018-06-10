package com.gpteam.java_learning.product_inventory;

public class Product {
   private String nazwa;
   private int cena;
   private int quantity;

    public Product(String cena, int id, int quantity) {
        this.nazwa = cena;
        this.cena = id;
        this.quantity = quantity;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setCena(String cena) {
        this.nazwa = cena;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
