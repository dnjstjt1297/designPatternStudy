package builderTest.textOrHtml;

public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("일반적인 인사");
        builder.makeItem(new String[]{
                "How are you?",
                "Hello",
                "Hi"
        });
        builder.makeString("시간대별 인사");

        builder.makeItem(new String[]{
                "Good morning",
                "Good afternoon",
                "Good night"
        });
        builder.close();
    }
}
