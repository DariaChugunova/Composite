public class main {
    public static void main(String args[]) {
        ShopComponent clothes =
                new Shop("Одежда");
        ShopComponent shoes =
                new Shop("Обувь");
        ShopComponent accessories =
                new Shop("Аксессуары");
        ShopComponent sunglasses =
                new Shop("Солнечные очки ");
        ShopComponent allShop = new Shop("Весь каталог");
        allShop.add(clothes);
        allShop.add(shoes);
        allShop.add(accessories);

        clothes.add(new ShopItem(
                "Футболка",
                "XS - XXL",
                true,
                500));
        clothes.add(new ShopItem(
                "Джинсы",
                "XS-XXL",
                true,
                3000));
        clothes.add(new ShopItem(
                "Носки",
                "36-45",
                true,
                300));
        clothes.add(new ShopItem(
                "Куртка",
                "S-XL",
                false,
                7000));

        shoes.add(new ShopItem(
                "Кроссовки",
                "35-45",
                true, 6000));
        shoes.add(new ShopItem(
                "Туфли",
                " 37-40",
                false, 5000));
        shoes.add(new ShopItem(
                "Сапоги",
                "35-39",
                false, 8000));


        accessories.add(new ShopItem(
                "Цепочка",
                "One size",
                false,
                2000));
        accessories.add(new ShopItem(
                "Сережки",
                "One size",
                false,
                3500));
        accessories.add(new ShopItem(
                "Кольца",
                "15-18,5",
                false,
                1500));

        accessories.add(sunglasses);
        sunglasses.add(new ShopItem(
                "Темные солнечные очки",
                "One size",
                false,
                3000));
        sunglasses.add(new ShopItem(
                "Розовые солнечные очки",
                "One size",
                false,
                3500));

        Shop_assistant waitress = new Shop_assistant(allShop);
        waitress.printShop();
    }
}
