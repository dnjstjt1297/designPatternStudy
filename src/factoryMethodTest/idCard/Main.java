package factoryMethodTest.idCard;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("abc");
        Product card2 = factory.create("dfg");
        Product card3 = factory.create("hij");
        card1.use();
        card2.use();
        card3.use();
    }
}
