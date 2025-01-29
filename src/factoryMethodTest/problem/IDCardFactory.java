package factoryMethodTest.problem;

import java.util.Iterator;

public class IDCardFactory extends Factory {

    private IDCardList idCardList;
    public IDCardFactory(IDCardList idCardList) {
        this.idCardList = idCardList;
    }

    @Override
    protected Product createProduct(String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        IDCard idCard = new IDCard(owner);
        idCardList.addIDCard(idCard);
        return idCard;
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard idCard = (IDCard) product;
        Iterator<IDCard> i = new IDCardListIterator(idCardList);
        int number = 0;

        re : while(number<Long.MAX_VALUE){
            while(i.hasNext()){
                IDCard cur = i.next();
                if(cur==idCard) break;
                if(cur.getNumber() == number){
                    number++;
                    continue re;
                }
            }
            idCard.setNumber(number);
            System.out.println(product+"를 등록했습니다.");
            break;
        }
    }
}
