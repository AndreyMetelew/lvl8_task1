package task;

/* 5. Вывести на экран список значений

Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
Вывести на экран список значений, каждый элемент с новой строки. */

import java.util.HashMap;

public class hashMapValueList {
    hashMapValueList () {
        HashMap<String, String> map = new HashMap<>();

        System.out.println();
        System.out.println("""
                Задание №5: Создать коллекцию HashMap типа String,String и добавить в нее 10 строк.
                После надо вывести значение каждого элемента коллекции с новой строки.""");
        System.out.println();

        System.out.println("Добавляем элементы в список...");
        map.put("Рожок", "Оружейная деталь");
        map.put("Здание", "Магазин");
        map.put("Магазин", "Оружейная деталь");
        map.put("Сыр", "Молочный продукт");
        map.put("Кефир", "Молочный продукт");
        map.put("Молоко", "Молочный продукт");
        map.put("Снежок", "Молочный продукт");
        map.put("Ряженка", "Молочный продукт");
        map.put("Сметана", "Молочный продукт");
        map.put("Рожок \"Extreme\"", "Мороженное");
        System.out.println("\nЭлементы добавлены в список.");

        System.out.println("\nЗначения этих элементов:");
        for (HashMap.Entry<String, String> pair : map.entrySet())
            System.out.println(pair.getValue());
        System.out.println();
    }
}