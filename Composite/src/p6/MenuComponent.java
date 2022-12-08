package p6;

//реализация по умолчанию для всех методов
public abstract class MenuComponent {
    //добавление
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    //удаление
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    //получение
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }
    public String getName() {
        throw new UnsupportedOperationException();
    }
    public String getDescription() {
        throw new UnsupportedOperationException();
    }
    public double getPrice() {
        throw new UnsupportedOperationException();
    }
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }
    public void print() {
        throw new UnsupportedOperationException();
    }
}