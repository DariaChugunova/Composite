public class ShopItem extends ShopComponent {
    String name;
    String size;
    boolean wash;//стирка
    double price;

    //Объект ShopItem содержит несколько полей
    //название, размерная сетка, флаг стирки, цена
    //Значения передаются конструктору для инициализации объекта MenuItem
    public ShopItem(String name,
                    String size,
                    boolean wash,
                    double price) {
        this.name = name;
        this.size = size;
        this.wash = wash;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public boolean getWash() {
        return wash;
    }

    public void print() {
        System.out.println("Название - " + getName());
        System.out.print("Размерная сетка - " + getSize());
        System.out.println("Цена - " + getPrice());
        System.out.println("Стирка - " + getWash());
        System.out.println();
    }
}
