package 복습.factoryMethod;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        IDCardList cl = IDCardList.getInstance();

        Factory f = new IDCardFactory();
        Product p1 = f.create("강태풍");
        Product p2 = f.create("지드레곤");
        Product p3 = f.create("천마");
        cl.appendIDCard((IDCard) p1);
        cl.appendIDCard((IDCard) p2);
        cl.appendIDCard((IDCard) p3);
        p1.use();
        p2.use();
        p3.use();
        Iterator<IDCard> it = cl.iterator();

        System.out.println("\n\n카드 목록");
        while (it.hasNext()) {
            IDCard idCard = (IDCard) it.next();
            System.out.println(idCard);
        }
    }
}
