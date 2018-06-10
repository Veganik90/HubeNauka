package com.gpteam.java_learning.zadanie_studia;

import java.util.Scanner;

/**
 * Treść zadania zrobionego poniżej:
 * Utworzyć klasę Telefon: składowe: string imie, string nazwisko, long numer
 *
 * Utwórz tablice takich obiektow, wypełniając ją jakąś przykładową zawartością.
 * Zdefiniuj funkcje: znajdzNazwiskoWyswietl, znajdzNumerWyswietl
 */
//    public static Telefon[] kontaktyBazaDanych;
public class Main {
     static Kontakt[] kontaktyBazaDanych = new Kontakt[3];
     /*
     obiekt klasy telefon musi byc zadeklarowany poza jakakolwiek metoda
      */
    public static void main(String... args) {

        kontaktyBazaDanych[0] = new Kontakt("xxx", "Ala", 5);
        kontaktyBazaDanych[1] = new Kontakt("xxx", "Tomek", 4);
        kontaktyBazaDanych[2] = new Kontakt("xxx", "Jan", 3);

        // uzytkownik wpisuje nazwisko, pobieramy je
        Scanner input = new Scanner(System.in);
        String nazwisko;
        System.out.print("Podaj nazwisko do wyszukania w bazie: ");
        nazwisko = input.nextLine();

        znajdzNazwiskoWyswietl(nazwisko);
    }

    /**
     * metoda znajdzNazwiskoWyswietl szuka nazwiska z tablicy kontaktyBazaDanych;
     * pętla iteruje nazwiska z tablicy kontaktyBazaDanych i porownuje je do
     * @param nazwisko
     */
       public static void znajdzNazwiskoWyswietl(String nazwisko) {
           for (int i = 0; i< kontaktyBazaDanych.length; i++) {

               if (kontaktyBazaDanych[i].getNazwisko().equals(nazwisko)) {
                   System.out.println("Znaleziono nazwisko w bazie: " + kontaktyBazaDanych[i].getNazwisko() );


               }
               else {
                   System.out.println("nie znalezniono nazwiska podanego od uzytkownika: " + nazwisko);
               }
           }
    }

//    public static void znajdzNumerWyswietl(long numer) {
//           for (int i = 0; i < kontaktyBazaDanych.length; i++){
//               if
//        }
//    }




    }

