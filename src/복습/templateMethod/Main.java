package 복습.templateMethod;

public class Main {

    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('c');
        AbstractDisplay d2 = new StringDisplay("asdfb");
        d1.display();
        d2.display();

    }
}
