package templateMethodTest.problem;

public interface AbstractDisplay {
    public abstract void open();
    public abstract void print();
    public abstract void close();

    default void display(){
        open();
        for(int i = 0;i<5;i++){
            print();
        }
        close();
    }
}
