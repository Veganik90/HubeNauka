package com.gpteam.java_learning.zadanie_studia;

public class Kontakt {
    private String nazwa;
    private String nazwisko;
    private long numer;

    public Kontakt(String nazwa, String nazwisko, long numer) {
        this.nazwa = nazwa;
        this.nazwisko = nazwisko;
        this.numer = numer;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public long getNumer() {
        return numer;
    }

    public void setNumer(long numer) {
        this.numer = numer;
    }
}

