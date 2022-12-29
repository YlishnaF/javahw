package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int []mas = createMas(1000);
        Set<Integer> num = new HashSet<>();
        for (int m : mas) {
            num.add(m);
        }
        System.out.println("Процент уникальных чисел: "+num.size()*100/mas.length);

    }
    public static int [] createMas(int size){
        int [] mas = new int[size];
        for (int i = 0; i < size ;i++) {
            mas[i]=(int)(Math.random()*24);
        }
        return mas;
    }

}
