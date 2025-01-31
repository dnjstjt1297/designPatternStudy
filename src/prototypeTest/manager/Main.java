package prototypeTest.manager;

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager();
        UnderLinePen u = new UnderLinePen('-');
        MessageBox m1 = new MessageBox('*');
        MessageBox m2 = new MessageBox('/');

        m.register("Strong Message", u);
        m.register("Waring box", m1);
        m.register("Slash box", m2);

        Product p1 = m.create("Strong Message");
        Product p2 = m.create("Waring box");
        Product p3 = m.create("Slash box");

        p1.use("Hello World");
        p2.use("Hello World");
        p3.use("Hello World");

    }
}
