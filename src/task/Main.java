package task;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	    // Вывод задания №1
        Plants task1 = new Plants();

        // Вывод задания №2
        tenCouples task2 = new tenCouples();

        // Основная часть задания №3

        /* 3. Коллекция HashMap из котов

        Есть класс Cat, с полем имя (name, String).
        Создать коллекцию HashMap<String, Cat>.
        Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
        Вывести результат на экран, каждый элемент с новой строки. */

        System.out.println();
        System.out.println("""
                Задание №3: Существует класс Cat с полем name типа String
                Создать коллекцию HashMap типа String,Cat и добавить в нее 10 строк,
                в качестве ключа используя имя кота.
                После надо вывести каждый элемент с новой строки.""");
        System.out.println();

        System.out.println("Создаем и заполняем коллекцию...\n");
        String[] cats = new String[] {"Вася", "Рыжик", "Дымка", "Миша", "Гриша", "Полосатик", "Боря", "Зинка", "Пушок", "Снежок"};

        Map<String, Cat> map = new HashMap<>();

        for (String s: cats) {
            map.put(s, new Cat(s));
        }
        System.out.println("\nКоллекция создана и заполнена.\n");

        System.out.println("Полученная коллекция:");
        for (Map.Entry<String, Cat> pair : map.entrySet())
            System.out.println(pair.getKey() + " - " + pair.getValue());

        // Вывод задания №4
        hashMapKeyList task4 = new hashMapKeyList();

        // Вывод задания №5
        hashMapValueList task5 = new hashMapValueList();

        // Вывод задания №6
        hashMapObjectCollection task6 = new hashMapObjectCollection();
    }
}