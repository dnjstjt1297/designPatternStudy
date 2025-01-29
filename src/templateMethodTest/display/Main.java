package templateMethodTest.display;

public class Main {
    public static void main(String[] args) {
        AbstactDispaly d1 = new CharDisplay('H');
        AbstactDispaly d2 = new StringDisplay("Hello world");

        d1.display();
        d2.display();

    }
}
