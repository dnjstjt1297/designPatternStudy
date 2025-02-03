package bridgeTest.problem;

public class CountDisplay extends Display {

    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int time) {
        int count = (int) Math.round(Math.random()*time);
        open();
        for(int i=0; i<count; i++) {
            print();
        }
        close();
    }

    public void trigleDisplay(int count){
        for(int i=0; i<count; i++) {
            open();
            for(int j=0; j<i; j++) {
                print();
            }
            close();
        }
    }
}
