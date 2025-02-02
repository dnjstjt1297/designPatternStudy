package 복습.factoryMethod;

import java.util.Iterator;

public class IDCardListIterator implements Iterator<IDCard> {
    private IDCardList idCardList;
    private int index;
    public IDCardListIterator(IDCardList idCardList) {
        this.idCardList = idCardList;
    }

    @Override
    public boolean hasNext(){
        if(index<idCardList.getLast()) return true;
        else return false;
    }

    @Override
    public IDCard next(){
        if(hasNext()){
            return idCardList.getIDCard(index++);
        }
        return null;
    }
}
