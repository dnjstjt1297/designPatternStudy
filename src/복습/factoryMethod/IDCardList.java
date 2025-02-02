package 복습.factoryMethod;

import java.util.ArrayList;
import java.util.Iterator;

public class IDCardList implements Iterable<IDCard> {
    private static IDCardList instance = new IDCardList();

    private ArrayList<IDCard> idCardList;
    private int last;

    public IDCardList() {
        idCardList = new ArrayList<>();
    }

    public void appendIDCard(IDCard idCard) {
        idCardList.add(idCard);
        last++;
    }

    public void removeIDCard(IDCard idCard) {
        idCardList.remove(idCard);
        last--;
    }

    public IDCard getIDCard(int index) {
        return idCardList.get(index);
    }

    public int getLast(){
        return last;
    }
    @Override
    public Iterator<IDCard> iterator() {
        return new IDCardListIterator(this);
    }

    public static IDCardList getInstance() {
        return instance;
    }
}
