package factoryMethodTest.problem;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        IDCardList idCardList = new IDCardList();
        Factory f = new IDCardFactory(idCardList);

        f.create("나루토");
        f.create("사스케");
        f.create("이타치");
        f.create("마다라");
        f.create("나루토");

        Iterator it = idCardList.iterator();
        System.out.println("\n\n카드 목록");
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
