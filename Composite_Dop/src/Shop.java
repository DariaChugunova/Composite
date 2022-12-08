import java.util.ArrayList;
import java.util.List;

//возвращает итератор для элементов меню
public class Shop extends ShopComponent {

    // может иметь любое кол-во потоков типа ShopComponent
    List<ShopComponent> shopComponentArrayList= new ArrayList<ShopComponent>();
    String name;

    public Shop(String name) {
        this.name = name;

    }

    //включаение в меню объектов  ShopItem
    public void add(ShopComponent shopComponent) {
        shopComponentArrayList.add(shopComponent);
    }
    //удаление
    public void remove(ShopComponent shopComponent) {
        shopComponentArrayList.remove(shopComponent);
    }
    //получение
    public ShopComponent getChild(int i) {
        return shopComponentArrayList.get(i);
    }
    public String getName() {
        return name;
    }



    public void print() {
        System.out.println("Название - " + getName());
        System.out.println("------------");
        for (ShopComponent shopComponent : shopComponentArrayList) {
            shopComponent.print();
        }
    }
}