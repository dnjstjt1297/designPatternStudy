package 복습.factoryMethod;

public abstract class Factory {
    public final Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
    public abstract Product createProduct(String owner);
    public abstract void registerProduct(Product p);
}
