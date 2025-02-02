package 복습.factoryMethod;

public class IDCard extends Product {
    private String owner;
    private int serial;

    public IDCard(String owner, int serial) {
        this.owner = owner;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getSerial() {
        return serial;
    }


    @Override
    public String toString() {
        return "[owner=" + owner + "]";
    }

    @Override
    public void use() {
        System.out.println(this+"의 카드를 사용합니다.");
    }

}
