package task;

/* 3. Коллекция HashMap из котов

Есть класс Cat, с полем имя (name, String).
Создать коллекцию HashMap<String, Cat>.
Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
Вывести результат на экран, каждый элемент с новой строки. */

public class Cat {
    String name;

    Cat (String name) {
        this.name = name;
        System.out.println("Встречайте, у нас новый котик - " + name + "!");
    }

    @Override
    public String toString()
    {
        return name != null ? name.toUpperCase() : null;
    }
}