public class Tracker {
    public void getTracker(Person person) {
        //Dependency inversion principle
        Print print = new Print();
        print.print("Заказ клиента" + person + ":");
        switch ((int) ((Math.random() * ((3 - 1) + 1)) + 1)) {
            case (1):
                print.print("Готовится к отправке");
                break;
            case (2):
                print.print("В пути");
                break;
            case (3):
                print.print("Прибыл в пункт назначения");
                break;
        }
    }
}
