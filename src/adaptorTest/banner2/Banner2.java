package adaptorTest.banner2;

public class Banner2 {
    private String string;

    public Banner2(String string) {
        this.string = string;
    }

    public void showWithParen(){
        System.out.println("("+string+")");
    }

    public void showWithAster(){
        System.out.println("*"+string+"*");
    }

}
