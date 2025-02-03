package strategyTest.prob;

public interface Strategy {
    public abstract Hand nexthand();
    public abstract void study(boolean win);
}
