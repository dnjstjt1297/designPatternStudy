package 복습.factoryMethod;

import java.util.Iterator;

public class IDCardFactory extends Factory {
    private int seiral = 100;
    @Override
    public Product createProduct(String owner) {
        System.out.println(owner+"의 카드를 생성합니다.");
        return new IDCard(owner, seiral);
    }

    @Override
    public void registerProduct(Product product) {
        System.out.println(product+"를 등록합니다.");
    }
}
