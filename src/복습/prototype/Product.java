package 복습.prototype;

public interface Product extends Cloneable {
    public abstract void use(String s);
    public abstract Product createCopy();
}
