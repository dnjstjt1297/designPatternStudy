package factoryMethodTest.problem;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IDCardListIterator implements Iterator {
    private IDCardList idCards;
    private int index;

    public IDCardListIterator(IDCardList idCards) {
        this.idCards = idCards;
    }

    @Override
    public boolean hasNext() {
        if(index < idCards.getLast()) return true;
        return false;
    }

    @Override
    public IDCard next() {
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        return idCards.getIDCard(index++);
    }
}
