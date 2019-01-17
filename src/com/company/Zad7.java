package com.company;

import java.util.Random;

//Napisz program który losuje 6 liczb z Dużego Lotka
public class Zad7 {
    public void myMethod(){
        Random random = new Random();
        System.out.println("Wylosowane liczby to: ");
        for (int i = 0; i < 6; i++) {
            int losuj = random.nextInt(49) + 1;
            System.out.println(losuj);
        }
    }
}
