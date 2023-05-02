import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Single-Responsibility principle класс Person отвечает только за данные клиента.
        Person person = new Person();
        Products products = new Products();
        Tracker tracker = new Tracker();
        boolean open = true;
        while (open) {
            System.out.println("Введите номер");
            System.out.println("1 Доступные для покупки товары" + "\n" +
                    "2 Заказ товаров" + "\n" +
                    "3 Просмотр корзины покупок" + "\n" +
                    "4 Возврат товара" + "\n" +
                    "5 Трекинг заказа" + "\n" +
                    "Для выхода ведите end");
            Scanner scanner = new Scanner(System.in);
            String number = scanner.nextLine();
            switch (number) {
                case ("1"):
                    products.getProducts();
                    break;
                case ("2"):
                    products.addBasket();
                    break;
                case ("3"):
                    products.getBasket();
                    break;
                case ("4"):
                    products.deleteBasket();
                    break;
                case ("5"):
                    tracker.getTracker(person);
                    break;
                case ("end"):
                    open = false;
                    break;
            }
        }
    }
}