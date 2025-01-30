package singletonTest.problem2;

public class Main {
    public static void main(String[] args) {
        Triple t1 = Triple.getInstance("ALPHA");
        Triple t2 = Triple.getInstance("BETA");
        Triple t3 = Triple.getInstance("GAMMA");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

    }
}
