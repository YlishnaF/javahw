package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }
//                       Задание 1
  public static void removeEven(List<Integer> list){
        list.removeIf(x->x%2==0);
  }
    //                   Задание 2
    public static void analizeList(List<Integer> list){
        int min = list.get(0);
        int max  = list.get(0);
        int sum=list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if(min>list.get(i)){
                min= list.get(i);
            }
            if(max<list.get(i)){
                max= list.get(i);
            }
            sum+= list.get(i);
        }

        System.out.printf("Минимум - %d, максимкм - %d, среднее арифметическое - %f", min, max,(double)sum/ list.size());
    }

}
