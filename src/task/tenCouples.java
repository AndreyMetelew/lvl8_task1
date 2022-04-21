package task;

/* 2. HashMap из 10 пар

Создать коллекцию HashMap<String, String>, занести туда 10 пар строк:
арбуз – ягода, банан – трава, вишня – ягода, груша – фрукт, дыня – овощ,
ежевика – куст, женьшень – корень, земляника – ягода, ирис – цветок, картофель – клубень.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.

Пример вывода (тут показана только одна строка):
картофель – клубень */

import java.util.HashMap;

public class tenCouples {
    HashMap<String,String> map = new HashMap<>();

    tenCouples() {
        System.out.println();
        System.out.println("""
                Задание №2: Создать коллекцию HashMap типа String,String и добавить в нее 10 строк:
                арбуз – ягода, банан – трава, вишня – ягода, груша – фрукт, дыня – овощ,
                ежевика – куст, женьшень – корень, земляника – ягода, ирис – цветок, картофель – клубень.
                После надо вывести каждый элемент с новой строки и проверить, как изменится порядок элементов.""");
        System.out.println();

        System.out.println("Ну поехали...\nДобавляем элементы в список...");
        map.put("Арбуз", "Ягода");
        map.put("Банан", "Трава");
        map.put("Вишня", "Ягода");
        map.put("Груша", "Фрукт");
        map.put("Дыня", "Овощ");
        map.put("Ежевика", "Куст");
        map.put("Женьшень", "Корень");
        map.put("Земляника", "Ягода");
        map.put("Ирис", "Цветок");
        map.put("Картофель", "Клубень");
        System.out.println("\nЭлементы добавлены в список.");

        System.out.println("\nЭти элементы:");
        for (HashMap.Entry<String, String> pair : map.entrySet())
            System.out.println(pair.getKey() + " – " + pair.getValue());
        System.out.println();
    }
}