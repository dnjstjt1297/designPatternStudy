package adaptorTest.banner2;

public class PrintBanner2 extends Print2 {

    Banner2 banner;

    public PrintBanner2(String string) {
        banner = new Banner2(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }

}
