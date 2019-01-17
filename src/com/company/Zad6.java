package com.company;

import java.util.Scanner;

//Napisz prosta gre - zadaniem uzytkownika bedzie zgadniecie liczby, ktora zainicjujemy np 600. W przypadku gdy liczba bedzie za duza
//lub za mala, uzytkownik powinien otrzymac podpowiedz, gramy dopoki uzytkownik zgadnie liczbe
public class Zad6 {
    public void myMethod(){
        int n=600;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoja liczbe");
        int proba=scanner.nextInt();
        while(proba!=n) {

            if (proba > n)
                System.out.println("To za duzo");
            if (proba < n)
                System.out.println("To za malo");
            proba=scanner.nextInt();
        }

        System.out.println("Gratulacje odgadłeś liczbe");
    }
}
