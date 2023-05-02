import java.util.Scanner;

//Interface segregation principle
public class Products implements Basket, Product {
    private String[] products;
    private int[] price;
    private int[] basket;

    public Products() {
        products = new String[]{" Молоко ", " Хлеб ", " Яйца ", " Макароны "};
        price = new int[]{70, 50, 60, 80};
        basket = new int[products.length];
    }

    public void getProducts() {
        for (int i = 0; i < products.length; i++)
            System.out.println(i + 1 + products[i] + price[i] + " руб.");
    }

    public void addBasket() {
        System.out.println("Ведите номер товара");
        getProducts();
        Scanner number = new Scanner(System.in);
        int number1 = number.nextInt();
        System.out.println("Ведите количество покупаемого товара товара");
        Scanner sum = new Scanner(System.in);
        basket[number1 - 1] += sum.nextInt();
    }

    public void getBasket() {
        for (int i = 0; i < products.length; i++) {
            if (basket[i] != 0) {
                System.out.println(products[i] + basket[i] + " шт. " + price[i] * basket[i] + " руб.");
            }
        }
    }

    public void deleteBasket() {
        System.out.println("Корзина");
        getBasket();
        System.out.println("Ведите номер товара");
        getProducts();
        Scanner number = new Scanner(System.in);
        int number1 = number.nextInt();
        System.out.println("Ведите количество возвращаемого товара");
        Scanner sum = new Scanner(System.in);
        basket[number1 - 1] -= sum.nextInt();
    }
}
