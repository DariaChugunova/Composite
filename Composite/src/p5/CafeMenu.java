package p5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {
    //реализует Menu, чтобы официанты могли его использовать как и две другие реализации
    Map<String, MenuItem> menuItems = new HashMap<String, MenuItem>();
    public CafeMenu() {
        addItem("Вегетарианский бургер и картофель фри",
                "Бургер на цельнозерновой булочке с добавлением картофельной котлеты,салата, помидора, огурцов и средняя порция картошки фри",
                true, 3.99);
        addItem("Окрошка",
                " Традиционный холодный суп русской кухни",
                false, 3.69);
        addItem("Куриный бургер и картофель фри",
                "Бургер на цельнозерновой булочке с добавлением куриной котлеты,салата, помидора, огурцов и средняя порция картошки фри",
                true, 4.29);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    //Получаем итератор только для значения
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}