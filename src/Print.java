public class Print implements Println {
    public void systemPrint(String text) {
        System.out.println(text);
    }

    @Override
    public void print(String text) {
        systemPrint(text);
    }
}
