package com.tms.homewolk11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Создается ArrayList с рандомным количеством рандомных элементов
 * С помощью Stream'ов на консоль выводится массив согласно условиям задания
 */

public class RandomArrayList {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        int counter = (int) (Math.random() * 20) + 5;
        int tmp = 0;
        for (int i = 0; i < counter; i++){
            tmp = (int) (Math.random() * 20) + 2 ;
            myList.add(tmp);
        }
        System.out.println("Дано:");
        System.out.println(myList);
        System.out.println();

        System.out.println("Без дубликатов:");
        System.out.println(myList.stream().distinct().collect(Collectors.toList()));
        System.out.println();

        System.out.println("Только четные элементы от 7 до 17:");
        System.out.println(myList.stream().filter(n -> (n%2 == 0) && (n >=7) && (n <= 17)).collect(Collectors.toList()));
        System.out.println();

        System.out.println("Все элементы умножены на 2:");
        System.out.println(myList.stream().map(n -> n * 2).collect(Collectors.toList()));
        System.out.println();

        System.out.println("Первые 4 элемента");
        System.out.println(myList.stream().limit(4).collect(Collectors.toList()));
        System.out.println();

        System.out.println("Количество элементов:");
        System.out.println(myList.stream().count());
        System.out.println();

        System.out.println("Среднее арифметическое всех элементов:");
        System.out.println(myList.stream().mapToInt((n) -> Integer.parseInt(String.valueOf(n))).average().orElse(Double.NaN));
    }
}
