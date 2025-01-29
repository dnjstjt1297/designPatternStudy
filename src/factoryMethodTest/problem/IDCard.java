package factoryMethodTest.problem;

public class IDCard extends Product {
    private String owner;
    private long number;

    public IDCard(String owner) {
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(owner+"의 카드를 사용합니다.");
    }

    public void setNumber(long number) {
        this.number = number;
    }
    public long getNumber() {
        return number;
    }


    @Override
    public String toString(){
        return "[IDCard:"+owner+" | Card Number:"+number+"]";
    }
}
