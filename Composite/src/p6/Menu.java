package p6;

import java.util.ArrayList;
import java.util.List;

//возвращает итератор для элементов меню
public class Menu extends MenuComponent {

    //меню может иметь любое кол-во потоков типа MenuComponent
    List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
    String name;
    String description;

    //с каждым меню связывается название и описание
    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }
    //включаение в меню объектов  MenuItem
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }
    //удаление
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }
    //получение
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    //выводится название о описание
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");
        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }
}