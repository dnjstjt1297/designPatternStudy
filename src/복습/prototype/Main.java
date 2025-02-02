package 복습.prototype;

public class Main {
    public static void main(String[] args) {
        Manage m = Manage.getInstance();
        Product p = new MessageBox('*');
        Product p2 = new UnderLinePen('-');
        Product p3 = new UnderLinePen('=');
        m.register("a",p);
        m.register("b",p2);
        m.register("c",p3);

        Product p4 = m.getProduct("a");
        Product p5 = m.getProduct("b");
        Product p6 = m.getProduct("c");

        p4.use("p");
        p5.use("oadf");
        p6.use("ifgs");

    }
}
