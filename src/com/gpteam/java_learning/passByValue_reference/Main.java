package com.gpteam.java_learning.passByValue_reference;

import java.util.Scanner;

public class Main {
    /**
     * ZADANIE:<p>
     * 1. Stwórz zmienną typu int o nazwie wiek (i nadaj jej wartość) oraz ją wyświetl.<p>
     * 2. Przypisz tą zmienną do inputu od użytkownika - Scanner (utworzenie obiektu scanner i skanowanie metodą {@link Scanner#nextInt()}<p>
     * 3. Utwórz metodę wyswietl (jeden argument int) - zmienia go oraz wyswietla.<p>
     * 4. Użyj sout do wyświetlenia zmiennej po wyjściu z metody 'wyswietl'<p>
     * 5. Wyswietl wartosc zmiennej wiek po wyjsciu z metody {@code wyswietl}<p>
     *    Czesc 2:
     * 6. Utwórz klasę Person - składowa: age oraz konstruktor, getter setter.<p>
     * 7. Stwórz obiekt tej klasy, dodaj sout (przez getter) po jej utworzeniu<p>
     * 8. Utwórz metodę (w klasie głównej) 'modifyAndPrint' (która przyjmuje obiekt klasy 'Person'),<p>
     *    zmienia ona składową otrzymanego obiektu (jako argument) na inną (setter) i wyświetla jej wartość (getter)<p>
     * 9. Wywołaj tę metodę na utworzonym wcześniej obiekcie<p>
     * 10. Użyj sout('wartosc po wroceniu do main:' + getter) na tym obiekcie.<p>
     *
     * UWAGI: Błąd: ...cannot be referenced from a static content - Rozwiązanie: metoda którą wywołujesz musi być static<p>
     *        ((NIEWAŻNE NA TYM ETAPIE) dlatego, że nie można wywołać metody niestatycznej (bez słówka static w definicji metody)<p>
     *        w metodzie statycznej (czyli w naszym przypadku main)<p>
     *        metoda static: Istnieje poza konkretnymi utworzonymi obiektami danej klasy, jest jakby wpisana w szablon tej klasy.
     */
    // słowa kluczowe: argument, wskaźnik, sterta, referencja, javadoc (ctrl + q), (multitasking*leze)
    public static void main(String... args) {
        // 2 przykłady pokazujące - czy przy wysyłaniu zmiennej do metody java pobiera jej wartość czy referencje (wskaźnik do zmiennej pokazujący na jej miejsce na stosie)
        // 1 PRZYKLAD ZE ZMIENNYMI PRYMITYWNYMI
        String x = "123";
        System.out.println("String przed wyslaniem do metody wyswietl: " + x);

        // prosimy uzytkownika o podanie stringa

        // nieważna jest nazwa zmiennej którą wysyłamy do metody,
        // ważne, że wysyłana jest kopia wartości tej zmiennej, a nie jej referencja (czyli nie wysyłamy adresu w pamięci, tylko samą wartość zmiennej)
        // po wejściu do metody, jej argumentem staje się ta wysłana wartość
        wyswietl(x);
        System.out.println("String po wróceniu do metody main, z metody wyswietl: " + x);
        System.getProperty("line.separator");
        System.out.println(); // przejscie do nowej linii

        //===========================================================

        // 2 PRZYKLAD ZE ZMIENNYMI OBIEKTAMI
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
