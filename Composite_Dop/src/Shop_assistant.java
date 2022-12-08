public class Shop_assistant {
    ShopComponent allShop;//основной магазин , верхний уровень
    public Shop_assistant(ShopComponent allShop) {
        this.allShop = allShop;
    }
    public void printShop() {
        allShop.print();
    }
}
