package com.gpteam.java_learning.zadanie3;



import java.util.Random;
import java.util.Scanner;

/**================================================================================================
 * vD381L
 *
 * Zadania z Javy, służące do zdobycia wiedzy, o:
 *     - posługiwaniu się składnią języka,
 *     - podstawowych operacjach arytmetycznych,
 *     - instrukcjach warunkowych, pętlach,
 *     - podstawowych działaniach na Stringach,
 *     - manipulacji, analizy Stringów,
 *     - zasadach działania metod, ich argumentów oraz modyfikatorów i zwracanych typóww,
 *     - losowaniu liczb z danego przedziału,
 *     - przeszukiwaniu, sortowaniu, odwracaniu kolejności tablic,
 *     - przekazywaniu danych w Javie -  przez wartość czy referencję?
 *
 * ================================================================================================
 *
 * Sciagawka:
 *     - budowa metody:
 *         typ_zwracanej_zmiennej nazwa_metody(Argument argument)
 *         np.
 *         void print(String text)
 *         public int add(int x, int y)
 *     - inicijalizacja a deklaracja:
 *         - deklaracja: int x; Klasa obiekt;
 *         - inicjalizacja: x = 5; obiekt = new Klasa();
 *         - deklaracja i inicjalizacja: int x = 5; Klasa obiekt = new Klasa();
 *     - zasięg zmiennych:
 *         - w nagłówku klasy (bezpośrednio pod jej deklaracją), ma zasięg
 *           w całej klasie - wszystkich metodach
 *         - w metodzie - zasięg TYLKO w metodzie w kórej została zadeklarowana
 *         - w nagłówku klasy z modyfikatorem dostępu public - dostępna w CAŁYM projekcie
 *
 *
 * ================================================================================================
 *
 * Klasy do zadań:
 * Klasa      Numery zadań
 *
 * Scanner    1, 2, 3, 7
 * Random     7, 8, 9, 10, 11, 14, 15
 *
 * Metody pomocnicze do zadań:
 * Są one podane jako podpowiedź, nie wymóg.
 * 11, 12, 13 - String.substring(), String.length()
 *
 * ================================================================================================
 * []
 *
 * Zadanie 1.
 * Napisz metodę, która prosi użytkownika o imię, a potem wita go, używając tego imienia.
 *\
 *
 * ------------------------------------------------------------------------------------------------
 * []
 *
 * Zadanie 2.
 * Napisz metodę, która prosi użytkownika o imię i wita go, tylko wtedy, kiedy jego imieniem
 * jest Hube lub Gabe.
 * ------------------------------------------------------------------------------------------------
 * []
 *
 * Zadanie 3.
 * Napisz metodę, która prosi o imię użytkownika i wita go tylko wtedy, gdy jest nim Hube lub Gabe,
 * ignorując przy sprawdzaniu wielkość liter.
 * ------------------------------------------------------------------------------------------------
 * []
 *
 * Zadanie 4.
 * Napisz metodę, która jako argument przyjmuje liczbę całkowitą n i wyświetla sumę od 1 do n.
 * ------------------------------------------------------------------------------------------------
 * []
 *
 * Zadanie 5.
 * Napisz metodę, która jako argumenty przyjmuje dwie dodatnie liczby całkowite i oblicza ich NWD,
 * metodą odejmowania.
 * https://pl.wikipedia.org/wiki/Algorytm_Euklidesa
 * ------------------------------------------------------------------------------------------------
 * []
 *
 * Zadanie 6.
 * Napisz metodę, która konwertuje liczbę zmiennoprzecinkową podaną w argumencie, z kilometrów
 * na mile i ją zwraca. Zastosuj printy, aby zobaczyć wartość przed i po, z dopisanymi odpowiednimi
 * jednostkami.
 * ------------------------------------------------------------------------------------------------
 * []
 *
 * Zadanie 7.
 * Napisz metodę, która losuje liczbę całkowitą z przedziału 1 - 100.
 *     - zadaniem użytkownika jest znalezienie wylosowanej liczby,
 *     - po każdej próbie odgadnięcia, metoda mówi czy podana liczba jest większa czy mniejsza
 *       od wylosowanej,
 *     - po odgadnięciu, wypisuje odgadniętą liczbę i w nowej linii ilość prób.
 * ------------------------------------------------------------------------------------------------
 * []
 *
 * Zadanie 8.
 * Napisz metodę, która losuje liczbę całkowitą z przedziału x, y i ją zwraca.
 * ------------------------------------------------------------------------------------------------
 * []
 *
 * Zadanie 9.
 * Napisz metodę, która zwraca największy element w 10 elementowej tablicy typu int.
 * Do wypełnienia tablicy losowymi liczbami możesz posłużyć się metodą z zadania 8.
 * ------------------------------------------------------------------------------------------------
 * []
 *
 * Zadanie 10.
 * Korzystając z zadania 8, napisz metodę, która zwraca losowo wypełnioną tablicę typu całkowitego,
 * o rozmiarze podanym jako pierwszy argument, a w kolejnych - przedział minimalnej
 * i maksymalnej wartości w każdym jej indeksie.
 * ------------------------------------------------------------------------------------------------
 * []
 *
 * Zadanie 11.
 * Korzystając z zadania 10, napisz metodę, która jako argument przyjmuje tablicę typu całkowitego,
 * wyświetla jej aktualne wartości w jednej linii, po przecinku. Następnie sortuje ją rosnąco
 * i ponownie wyświetla.
 * ---
 * Bonus:
 * Niech użytkownik ma wybór co do sortowania:
 * 1. rosnąco
 * 2. malejąco
 * ------------------------------------------------------------------------------------------------
 * []
 *
 * Zadanie 12.
 * Napisz metodę, która odwraca String podany w argumencie i go zwraca.
 * np. argument: harnas - metoda zwraca String sanrah
 * ------------------------------------------------------------------------------------------------
 * []
 *
 * Zadanie 13.
 * Napisz metodę typu boolean, która zwraca true, jeśli podany String to palindrom. False jeśli nie.
 * Opisz jej działanie printami.
 * ------------------------------------------------------------------------------------------------
 * []
 *
 * Zadanie 14.
 * Napisz metodę, która odwraca kolejność elementów w 10 elementowej tablicy typu całkowitego.
 * Wypełnij ją losowymi danymi, używając metody z zadania 8 (lub 10?). Wyświetl jej zawartość
 * po przecinku, przed i po odwróceniu.
 * np. tablica[0] = 2000
 *     tab1ica[1] = 5
 *     ...
 *     tablica[8] = 757
 *     tablica[9] = 11
 *
 * po odwróceniu:
 *     tablica[0] = 11
 *     tab1ica[1] = 757
 *     ...
 *     tablica[8] = 5
 *     tablica[9] = 2000
 * ------------------------------------------------------------------------------------------------
 * []
 *
 * Zadanie 15.
 *
 *    NumberHolder:
 *
 *   - value : int
 * ___________________
 *   + getValue : int
 *   + sortArray(NumberHolder[] numberHolder, int sortOrder) : NumberHolder[]
 *     ---------------------------------------------------------------------
 *
 *
 * Metoda sortArray(NumberHolder[] numberHolder), jako argument przyjmuje tablicę obiektóww
 * klasy NumberHolder, sortuje ją w zależności od argumentu sortOrder:
 *     - 0 - sortowanie rosnąco, jest to również wartość domyślna
 *     - 1 - sortowanie malejąco
 *
 * Jeśli zmienna sortType nie wynosi 0 lub 1, domyślnie wybierane jest sortowanie rosnąco.
 * Po zakończeniu, zwraca posortowaną tablicę.
 *
 * * W klasie Main, utwórz metodę 'print', która jako argument, przyjmuje tablicę typu NumberHolder
 *   i wyświetla wartość, jaką przechowują jej obiekty, po przecinku, w tej samej linii.
 *
 * -----
 * Polecenia:
 * 1. W klasie Main, utwórz 10 obiektów klasy NumberHolder z losowymi wartościami i wsadź je
 *    do tablicy 'numbers'.
 * 3. Wywołaj metodę 'print', wysyłając do niej tablicę 'numbers'.
 * 4. Wywołaj statyczną metodę 'sortArray', wysyłając do niej naszą tablicę. Przypisz otrzymaną,
 *    posortowaną tablicę do tej samej zmiennej.
 * 5. Ponownie wywołaj metodę 'print', na tablicy 'numbers'.
 * ------------------------------------------------------------------------------------------------
 * []
 *
 * Zadanie 16.
 *
 *
 *
 *
 * ================================================================================================

 *
 * ================================================================================================
 */
public class Main {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String... args) {

        znajdzLiczbe();




    }

    public static void  podajImie(){
        String imie;

        imie = scanner.nextLine();
        System.out.println("czesc" + imie);
    }

    public static void podajImie2() {
        String imie;
        imie = scanner.nextLine();

        if (imie.equals("Hube") || imie.equals("Gabe")) {
            System.out.println("czesc " + imie); // if (warunek) if ( (imie.equals() || imie.equals()) { }
        } else {
            System.out.println("zle imie");
        }
    }

    public static void podajImie3() {
        String imie;
        imie = scanner.nextLine();

        if (imie.equalsIgnoreCase("Hube") || imie.equalsIgnoreCase("Gabe")) {
            System.out.println("czesc " + imie);
        } else {
            System.out.println("zle imie");
        }
    }

    public static void podajLiczbe(int n) {
        int suma = 0; //
        for(int i = 1; i <= n; i++) {
            suma +=i; // suma = suma + i;


        }
        System.out.println("suma to: " + n);
    }

    public static void NWD(int a, int b) {
        while(a != b ){
            if (a > b){
                a -= b; // a = a - b

            } else {
                b -= a; // b = b-a
            }
        }
        System.out.println("NWD podanych liczb to: " + a);
    }

    public static double kmhToMph(double kmh) {

        return kmh * 0.62;
    }

    public static void znajdzLiczbe() {
        Random losui = new Random();
        int wylosowanaliczba = losui.nextInt(101); // metoda nextInt z arg. bound (przedzial 1-100),
        int inputOdUzytkownika;
        int iloscProb = 0;

       do {
           System.out.println("wylosowana liczba: " + wylosowanaliczba);
           System.out.print("Podaj liczbe: ");

           inputOdUzytkownika = scanner.nextInt();
           if (wylosowanaliczba == inputOdUzytkownika){
               System.out.println("Zgadles liczbe: " + wylosowanaliczba + "\nzgadles po probach: " + iloscProb  );
               break;
           }

           else if (wylosowanaliczba > inputOdUzytkownika){
               System.out.println("Wyloowales wieksza liczbe. ");
               iloscProb++;

           } else {
               System.out.println("Wylosowales mniejsza liczbe.");
               iloscProb++;
           }


       } while (wylosowanaliczba != inputOdUzytkownika);




    }

}
