import java.util.Scanner;

//Liskov substitution principle
public class Person extends Persons {

    public Person() {
        System.out.println("Для регистраций введите имя");
        Scanner scanner = new Scanner(System.in);
        this.name = scanner.nextLine();
        System.out.println("Для регистраций введите телефон");
        Scanner scanner1 = new Scanner(System.in);
        this.number = scanner1.nextLine();
    }

    @Override
    public String toString() {
        return " " + name + " " + number;
    }
}
