package prototypeTest.manager;

public interface Product extends Cloneable {
    public abstract void use(String s);
    public abstract Product createCopy();
}
