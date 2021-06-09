package com.tms.homewolk11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Возвращает количество студентов в группе с заданным именем
 * Выводит имена студентов начинающиеся на А
 * Сортирует имена по алфавиту и выводит первое имя в списке, если список пуст, то выводит Empty
 */
public class GroupArray {
    public static void main(String[] args) {
        List<String> group = new ArrayList<>();
        group.add("Юлия");
        group.add("Антон");
        group.add("Ольга");
        group.add("Виталий");
        group.add("Аина");
        group.add("Виталий");
        group.add("Александр");
        group.add("Светлана");
        group.add("Евгений");
        group.add("Мария");
        group.add("Лера");
        group.add("Мария");
        group.add("Катрина");
        group.add("Татьяна");
        group.add("Егор");

        System.out.println("Список группы");
        System.out.println(group);

        System.out.println("--------------------");
        System.out.println("Введите свое имя");
        Scanner userInput = new Scanner(System.in);
        String name = userInput.nextLine();
        System.out.println("Количество студентов в группе с таким именем: "
                + group.stream().filter(n -> n.equals(name)).count());

        System.out.println("--------------------");
        System.out.println("Имены студентов на А");
        System.out.println(group.stream().filter(n -> n.toLowerCase().indexOf("а") == 0).collect(Collectors.toList()));

        System.out.println("--------------------");
        System.out.println("Первое имя по алфавиту");
        System.out.println(group.stream().sorted().findFirst().orElse("Empty"));
    }
}
