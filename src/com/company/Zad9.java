package com.company;

import java.util.Scanner;

//Napisz program ktory odczytuje n i oblicza n!
public class Zad9 {
    public int myMethod(int n){
      int sum=1;
        for (int i = 1; i <=n ; i++) {
            sum=sum*i;

        }return sum;
    }

}
