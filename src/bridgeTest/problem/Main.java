package bridgeTest.problem;

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, Korea"));
        Display d2 = new Display(new StringDisplayImpl("Hello, World"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, World"));

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(40);


        String divpath = "/Users/kim-wonseok/프로그래밍/intelliJ-workspace/designPatternStudy/src/bridgeTest/problem";
        String filename = "file.text";
        Display d4 = new Display(new TextDisplayImpl(divpath, filename));
        d4.display();

        CountDisplay d5 = new CountDisplay(new CharDisplayImpl('|','#','-'));
        d5.trigleDisplay(5);
    }
}
