package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    }
//                   Задание 1
    public static boolean isSumInRange(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }
//                   Задание 2
    public static void posOrNeg(int a) {
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }
//                   Задание 3
    public static boolean negTrue(int a){
        return a<=0;
    }

//                   Задание 4
    public static void printSomeTimes(String s, int a){
        for (int i = 0; i < a; i++) {
            System.out.println(s);
        }
    }

//                   Задание 5
    public static boolean checkYear(int year){
        return year % 100 == 0 || year % 4 == 0;
    }

//                   Задание 6
    public static int[] changeOneZero(int[] mas){
        int [] nMas = new int [mas.length];
        for (int i = 0; i < mas.length; i++) {
            if(mas[i]==0){
                nMas[i]=1;
            } else nMas[i]=0;
        }
        return nMas;
    }
//                   Задание 7
    public static int[] createMasTill100(){
        int []mas = new int [100];
        for (int i = 0; i < 100; i++) {
            mas[i] = i+1;
        }
        return mas;
    }
//                   Задание 8
    public static int [] multTwo(){
        int[] m = new int[] { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < m.length; i++) {
            if(m[i]<6){
                m[i]=m[i]*2;
            }
        }
        return m;
    }

//                   Задание 9
    public static void doubleMas(){
        int[][] mas = new int[5][5];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if(i==j){
                    mas[i][j]=1;
                } else {
                    mas[i][j]=0;
                }
                System.out.print(mas[i][j]);
            }
            System.out.println();
        }
    }
//                   Задание 10
    public static int[] createMas(int len, int initialValue){
        int [] mas = new int[len];
        for (int i = 0; i < len; i++) {
            mas[i]=initialValue;
        }
        return mas;
    }

//                   Задание 11
    public static void findMinMax(int[] m){
        int min=m[0];
        int max =m[0];
        for (int i = 1; i < m.length; i++) {
            if (m[i]>max) {
                max=m[i];
            }
            if(m[i]<min){
                min=m[i];
            }
        }
        System.out.printf("min - %d, max - %d", min, max);
    }
}
