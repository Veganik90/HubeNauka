package com.gpteam.java_learning.zadanie3;

public class Liczba {
    private int wartosc;

    public Liczba(int wartosc) {
        this.wartosc = wartosc;
    }

    public int getWartosc() {
        return wartosc;
    }

    public static void wyswietl(Liczba[] liczba) {
        for (int i = 0; i < liczba.length; i++) {
            System.out.println("index " + i + ": " + liczba[i].getWartosc());
        }
    }
}
