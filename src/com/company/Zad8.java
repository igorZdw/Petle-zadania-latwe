package com.company;
//Napisz program,ktory prosi o podanie poprawnego hasla(haslo to Polska), tak dlugo jak uzytkownik nie odgadnie hasla prosze wyswietlic komunikat

import java.util.Scanner;

public class Zad8 {
    public void myMethod(){
        String password="Polska";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj haslo");
        String pass = scanner.next();
        while(!pass.equals(password)) {


            System.out.println("Błędne hasło, spróboj ponownie");
            pass = scanner.next();
        }
        System.out.println("Gratulacje odgadłeś haslo");
    }

}
