package factoryMethodTest.idCard;

public class IDCardFactory extends Factory{

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product Product) {
        System.out.println(Product+"을 등록했습니다.");
    }
}
