package p5;

public class main5 {
    public static void main(String args[]) {
        //создаем меню
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        //передаем официанту меню
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu,cafeMenu);
        waitress.printMenu();
    }
}
