package task;

/* 6. Коллекция HashMap из Object

Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.

Пример вывода (тут показана только одна строка):
Sim - 5 */

import java.util.HashMap;

public class hashMapObjectCollection {
    HashMap<String,Object> map = new HashMap<>();

    hashMapObjectCollection () {
        System.out.println();
        System.out.println("""
                Задание №6: Создать коллекцию HashSet типа String, Object и добавить в нее 10 различных пар объектов.
                После надо вывести каждый элемент с новой строки.""");
        System.out.println();

        System.out.println("Добавляем элементы в список...");
        map.put("Кошка", "Машка");
        map.put("Число", 5);
        map.put("Магазин", "5");
        map.put("Торт", false);
        map.put("Ребенок", null);
        map.put("Собака", 5);
        map.put("Снег", "Осадки");
        map.put("Еда", 80);
        map.put("Сон", true);
        map.put("Леденец", "Конфета");
        System.out.println("\nЭлементы добавлены в список.");

        System.out.println("\nЗначения этих элементов:");
        for (HashMap.Entry<String, Object> pair : map.entrySet())
            System.out.println(pair.getKey() + " - " + pair.getValue());
        System.out.println();
    }
}