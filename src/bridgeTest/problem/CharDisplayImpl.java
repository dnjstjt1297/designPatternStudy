package bridgeTest.problem;

public class CharDisplayImpl extends DisplayImpl {

    private char start;
    private char ch;
    private char end;
    public CharDisplayImpl(char start, char ch, char end) {
        this.start = start;
        this.ch = ch;
        this.end = end;
    }

    @Override
    public void rawOpen() {
        System.out.print(start);
    }

    @Override
    public void rawPrint() {
        System.out.print(ch);
    }

    @Override
    public void rawClose() {
        System.out.println(end);
    }
}
