package templateMethodTest.display;

public abstract class AbstactDispaly {

    public abstract void open();
    public abstract void print();
    public abstract void close();

    public void display(){
        open();
        for(int i = 0;i<5;i++){
            print();
        }
        close();
    }
}
