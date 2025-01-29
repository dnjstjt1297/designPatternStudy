package factoryMethodTest.problem;

import java.util.ArrayList;
import java.util.Iterator;

public class IDCardList implements Iterable<IDCardList> {
    private ArrayList<IDCard> IDcards = new ArrayList<>();
    private int last = 0;

    public void addIDCard(IDCard idCard) {
        IDcards.add(idCard);
        last++;
    }

    public void removeIDCard(IDCard idCard) {
        if(IDcards.contains(idCard)) {
            IDcards.remove(idCard);
            last--;
        }
    }

    public int getLast() {
        return last;
    }

    public IDCard getIDCard(int index) {
        return IDcards.get(index);
    }

    @Override
    public Iterator<IDCardList> iterator() {
        return new IDCardListIterator(this);
    }
}
