package p6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Waitress {
    MenuComponent allMenus;//основное меню, верхний уровень
    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }
    public void printMenu() {
        allMenus.print();
    }
}