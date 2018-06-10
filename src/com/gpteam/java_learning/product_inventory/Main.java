package com.gpteam.java_learning.product_inventory;

import com.gpteam.java_learning.passByValue_reference.Pies;

public class Main {
    public static void main(String[] args) {
        String x = "123";
        System.out.println("String przed wyslaniem do metody wyswietl: " + x);
        // prosimy uzytkownika o pdoanie stringa

        // nieważna jest nazwa zmiennej którą wysyłamy do metody,
        // ważne, że wysyłana jest kopia wartości tej zmiennej, a nie jej referencja (czyli nie wysyłamy adresu w pamięci, tylko samą wartość zmiennej)
        // po wejściu do metody, jej argumentem staje się ta wysłana wartość
        wyswietl(x);
        System.out.println("String po wróceniu do metody main, z metody wyswietl: " + x);

        System.out.println();

        Pies piesCzarek = new Pies("Czarek");
        System.out.println("Wartość składowej 'imie' obiektu piesCzarek w metodzie main: " + piesCzarek.getName());

        zmienImie(piesCzarek);

        System.out.println("Wartość składowej 'imie' obiektu piesCzarek po wysłaniu do metody zmienImie: " + piesCzarek.getName());
    }

    /**
     * Przyjmuje argument obiektu pies i zmienia wartosc jej skladowej imie na 'Szarik')
     * Kiedy wysyłamy obiekt do metody - wysyłany jest wskaźnik do adresu obiektu na stercie
     * @param pies
     */
    public static void zmienImie(Pies pies) {
        pies.setName("Szarik");
        System.out.println("Wartość składowej 'imie' obiektu piesCzarek po wysłaniu do metody zmienImie: " + pies.getName());
    }
    /**
     * Przyjmuje argument wartosc i wyswietla go.
     * Argument wartość jest typu String.
     *
     * @param wartosc
     */
    static void wyswietl(String wartosc) {
        wartosc = "999";
        System.out.println("String w metodzie wyswietl: " + wartosc);
    }
}

















//        inventory = new Inventory();
//        Product jablko = new Product("Jablko", 5, 1);
//        Product gruszka = new Product("Gruszka", 3, 2);
//
//        inventory.putProduct(jablko);
//        inventory.putProduct(gruszka);
//        inventory = new Inventory();
//
//
//
//        inventory.print();





