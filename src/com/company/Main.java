package com.company;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

    public static void main(String[] args) {
//        Задание 0

        // interface Collection
        Collection<Integer> intCol = new ArrayList<>();
        intCol.add(2);
        intCol.add(14);
        System.out.println("Collection коллекция: " + intCol);
        intCol.remove(14);
        System.out.println("удалили значение 14: " + intCol + "\n");


        // interface List
        List<Integer> intList = new LinkedList<>();
        intList.add(12);
        intList.add(29);
        System.out.println("List коллекция: " + intList);
        System.out.println("удалили элемент по индексу 1: " + intList.remove(1));
        System.out.println("получили элемент по индексу 0: " + intList.get(0) + "\n");

        //interface Queue
        Queue<Integer> integerQueue = new LinkedList<>();
        integerQueue.add(13);
        integerQueue.add(234);
        integerQueue.add(34);
        System.out.println("Queue коллекция: " + integerQueue);
        integerQueue.remove(13);
        System.out.println("удалили значение 13: " + integerQueue);
        System.out.println("получили первый элемент: " + integerQueue.peek());
        System.out.println("получили и удалили первый элемент: " + integerQueue.poll() + "\n");

        //interface Deque
        Deque<Integer> integerDeque = new ArrayDeque<>();
        integerDeque.add(67);
        integerDeque.addFirst(21);
        integerDeque.offerFirst(25);
        integerDeque.addLast(2);
        System.out.println("Deque коллекция: " + integerDeque);
        integerDeque.remove(21);
        System.out.println("удалили значение 21: " + integerDeque);
        System.out.println("получили первый элемент: " + integerDeque.peek());
        System.out.println("получили и удалили первый элемент: " + integerDeque.poll());

        //Задание 1
        readConsole();

        //Задание 2
        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(2);
        integers.add(3);
        integers.add(4);
        System.out.println("Начальный список: " + integers + ". Перевернутый список: " + reverse(integers));
    }

    //      Задание 1
    public static void readConsole() throws IndexOutOfBoundsException {
        List<String> strings = new LinkedList<>();
        Scanner console = new Scanner(System.in);
        String line = null;
        while (!(line = console.nextLine()).equals("break")) {
            String s = line.split("~")[0];
            int i = Integer.parseInt(line.split("~")[1]);
            if (s.equals("print")) {
                try {
                    System.out.println(strings.remove(i));
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Нет элемента");
                }
            } else {
                try {
                    strings.add(i, s);
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Невозможно вставить на указанный индекс, размер массива: " + strings.size());
                }
            }
        }
    }

    //  Задание 2
    private static <T> List<T> reverse(LinkedList<T> source) {
        LinkedList<T> newList = new LinkedList<>();
        for (int i = source.size() - 1; i >= 0; i--) {
            newList.add(source.get(i));
        }
        return newList;
    }
}
